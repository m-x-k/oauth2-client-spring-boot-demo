FROM java:8

RUN mkdir /app
ADD build/libs/myclient.jar /app/

ENTRYPOINT ["java", "-jar", "/app/myclient.jar"]
