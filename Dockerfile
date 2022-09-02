#FROM openjdk
#VOLUME /tmp
#COPY target/bookstore-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#H2
FROM openjdk
ENV H2_VERSION h2-2022-06-13
COPY h2/ h2/
ENV DATA_DIR /opt/h2-data
RUN mkdir -p ${DATA_DIR}
EXPOSE 8082 9092
ENTRYPOINT h2\bin\h2-2.1.214.jar org.h2.tools.Server -ifNotExists \
    -web -webAllowOthers \
    -tcp -tcpAllowOthers \
    -baseDIr ${DATA_DIR} ${H2_OPTIONS}

ENTRYPOINT java -cp /h2/bin/h2*.jar org.h2.tools.Server -webAllowOthers -tcpAllowOthers -pgAllowOthers

#command
#docker run -itd --name h2 -p 8082:8082 -p 9092:9092 koushik/h2