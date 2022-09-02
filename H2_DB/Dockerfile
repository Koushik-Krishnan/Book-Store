FROM openjdk
ENV H2_VERSION h2-2022-06-13

RUN wget https://github.com/h2database/h2database/releases/download/version-2.1.214/h2-2022-06-13.zip
RUN unzip ${H2_VERSION}.zip

EXPOSE 9092 5435 8082
ENTRYPOINT java -cp /h2/bin/h2*.jar org.h2.tools.Server -webAllowOthers -tcpAllowOthers -pgAllowOthers