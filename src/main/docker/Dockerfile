FROM java:8-jre

MAINTAINER Manhattan Associates

ADD main-stage.jar main.jar

#ADD build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar main.jar
#ADD entrypoint.sh /entrypoint.sh

#RUN chmod +x /entrypoint.sh

EXPOSE 8080:8080

#ENTRYPOINT ["/entrypoint.sh"]

#CMD ["sh", "-c", "java $JAVA_OPTS -jar /main.jar"]


#ENTRYPOINT ["java -jar main.jar"]

ENTRYPOINT ["java", "-jar", "main.jar"]


