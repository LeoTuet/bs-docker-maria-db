# MariaDB-docker-compose
A MariaDB Docker-Compose

Please replace the Password and User Env vars with better values

### To enter the MariaDB shell you first need to enter the docker container.

docker-compose exec mariadb sh // to start docker in sh

mysql -u root -p //Log in as admin

### When using the Jetbrains IDE's
To connect MariaDB use the Datasource function in Jetbrains.
The address is localhost and the port is 3306.
Also add the right Authentication.