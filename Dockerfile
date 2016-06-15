FROM java:8

RUN mkdir /app
ADD build/libs/myclient.jar /app/

CMD ["java", "-jar", "/app/myclient.jar"]