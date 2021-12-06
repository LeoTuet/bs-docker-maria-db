# MariaDB-docker-compose
A MariaDB Docker-Compose

Please replace the Password and User Env vars with better values

To enter the MariaDB shell you first need to enter the docker container.

docker ps
-> Copy the id of the mariaDB Container

docker exec -it ID_OF_THE_CONTAINER bash

mysql -u admin -p //Log in as admin
