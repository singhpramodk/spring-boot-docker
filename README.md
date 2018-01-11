# spring-boot-docker


Build :
gradle clean build

Create docker image:

gradle buildDocker

Build docker image:
docker build -t springdocker src/main/docker/.

docker build -t <tagname> <dockerfile-path>

docker run -p 8080:8080 springdocker



docker run -p 8080:8080 springdocker com.example/spring-boot-docker:0.0.1-SNAPSHOT
