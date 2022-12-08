FROM openjdk:11
VOLUME /tmp 
ARG JAR_FILE=build/libs/msa-back2-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar 
EXPOSE 9091
ENTRYPOINT ["java","-jar","/app.jar"]