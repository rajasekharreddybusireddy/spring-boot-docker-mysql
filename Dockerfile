FROM openjdk:8
EXPOSE 8090
ADD target/spring-boot-docker-mysql.jar spring-boot-docker-mysql.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker-mysql.jar"]

