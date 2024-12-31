# Developer Aider

Developer help developers


## setup environment
### generate certificate

```
mkdir -p deploy/certs
cd deploy/certs
openssl genrsa -out nginx.key 2048
openssl req -new -key nginx.key -out nginx.csr
openssl x509 -req -days 365 -in nginx.csr -signkey nginx.key -out nginx.crt

```

### create db user

```
docker exec -it devaider_mariadb mariadb -u root -p
CREATE DATABASE devaider;
CREATE USER 'walter'@'%' IDENTIFIED BY 'your_pwd';
GRANT ALL PRIVILEGES ON devaider.* TO 'walter'@'%';
FLUSH PRIVILEGES;
```

### create a .env file

```
DB_NAME=${db_name} 
DB_USER=${db_username} 
DB_PWD=${db_password} 
DB_HOST=${db_host} 
DB_PORT=${db_port} 

```
