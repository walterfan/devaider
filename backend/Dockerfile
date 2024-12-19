FROM openjdk:21
COPY target/devaider-0.0.1-SNAPSHOT.jar /usr/src/devaider
WORKDIR /usr/src/devaider
EXPOSE 8080
CMD ["java" ,"-jar", "devaider-0.0.1-SNAPSHOT.jar" ]