# AnySync Client 

<img src="http://anysync.net/assets/images/client_main.png" alt="client window"/>

An open source client for [AnySync](https://anysync.net), which is 
a secure cloud storage service with end-to-end encryption.
## Features
- End-to-end file encryption: data is encrypted using 256-bit AES-GCM, and it can only be accessed with your key. Neither an administrator nor third parties can read the data.
- Incremental backup and sync.
- Smart Sync (placeholder files): it helps you reduce local disk storage.
- Selective Sync to save local disk space.
- Deduplication: only uniqure data is compressed and uploaded to the cloud.
- Versioned file backup and sync.

## Documentation
                                 
Please see the AnySync [website](https://anysync.net/documentation/index.html) for more detailed doucmentation.

## Installation 


Download and install the lastest [release](https://github.com/anysync/client/releases). Currently supported platforms include
Windows, 64-bit Linux and 64-bit macOS.

If you choose to use self-hosted edition, you need to install AnySync [server](https://github.com/anysync/server) too.

## Technology Overview

### Data Encryption
- Secure random 256-bit file key and auth key are generated.
- A [NaCl](https://en.wikipedia.org/wiki/NaCl_(software)) box public/private key pair is generated.
- In the login request, client sends out a data structure with these data:
-- Client version number.
-- Email as user name.
-- Newly generated box public key used by the server for encrypting access token.
- In the login response, it contains following data
-- User ID
-- Device ID
-- Access token encrypted by the box public key. Local box private key is used to decrypt it. The access token will be used on the client side for authentication.

[scrypt](https://en.wikipedia.org/wiki/Scrypt "scrypt") is used for generating key from user's password. Default scrypt parameters are 

`Params{N: 16384, R: 8, P: 1, SaltLen: 16, DKLen: 32}`

The key is used for encrypting the file key, auth key, access token and public/private key pair, and the encrypted data is saved to a local file called "master.keys", which will be sent to the server. In the future, user can use the password to decrypt the file and know all the keys so that all the user's cloud files can be decrypted.

The access token is saved to a local file called "access.keys", which is unecrypted. This file is for authenticating the user, similar to the private key file used by SSH client for passwordless login.

All files will be encrypted by the key using 256-bit [AES-GCM](https://en.wikipedia.org/wiki/Galois/Counter_Mode "AES-GCM"), then encrypted file will be uploaded to the cloud.

### Data Transmission

The communication between AnySync client and server is gRPC with TLS.

[Rclone](https://github.com/rclone/rclone) is used to transfer files to any S3 compatible cloud storage servers. 

### Data Format

AnySync stores data in a format inspired by the [Git](https://en.wikipedia.org/wiki/Git).
File metadata are stored under tree directory. File data are encrypted, compressed and stored as objects with names being their hash values, and file names
are encrypted and stored in sqlite database. 


