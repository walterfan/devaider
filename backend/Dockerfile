FROM openjdk:21-slim
#RUN mkdir -p /root/.m2 && mkdir /root/.m2/repository
#COPY settings.xml /root/.m2
#RUN sed -i 's/deb.debian.org/mirrors.ustc.edu.cn/g' /etc/apt/sources.list.d/debian.sources
#RUN apt-get update && apt-get install maven -y
RUN mkdir -p /usr/src/devaider
#COPY ./* /usr/src/devaider/
#RUN cd /usr/src/devaider && mvn clean package
COPY target/devaider-0.0.1-SNAPSHOT.jar /usr/src/devaider
WORKDIR /usr/src/devaider
EXPOSE 8080
CMD ["java" ,"-jar", "devaider-0.0.1-SNAPSHOT.jar" ]