FROM socle-bpceit-jdk:1.8.0-1
COPY docker-helloworld-1.0-SNAPSHOT.jar /app/hello.jar
ENTRYPOINT ["java", "-cp", "/app/hello.jar", "omar.mebarki.docker.HelloWorld"]