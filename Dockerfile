FROM openjdk:11
EXPOSE 9094
ADD target/docker-image-name.jar docker-image-name.jar

ENTRYPOINT ["java","-jar","/docker-image-name.jar"]