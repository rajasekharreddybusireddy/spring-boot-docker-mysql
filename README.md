# spring-boot-docker-mysql
spring-boot-docker-mysql



Deploy Spring Boot + MYSQL Application to Docker


=====================================================================================


step 1:-docker run --name docker-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql:latest --default-authentication-plugin=mysql_native_password


step 2:-docker build . -t users-mysql-app


step 3:-docker run -p 9000:8090 --name final-app --link docker-mysql:mysql  users-mysql-app  //in detached mode -d

use full commands
===============
docker images ls
docker images ls -a
docker ps
docker rmi -f imagename
docker rm -f containername
docker start -a container-name

for logs
===========
docker logs container-name


Get:http://192.168.99.100:9000/all

POST:-http://192.168.99.100:9000/save
  {
        "empName": "RAJASEKHAR REDDY",
        "salary": 50000.3
    }

not able to connect to mysql docker from local
https://stackoverflow.com/questions/49019652/not-able-to-connect-to-mysql-docker-from-local

========================================================================================
