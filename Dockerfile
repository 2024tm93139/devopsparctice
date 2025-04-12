FROM alpine/java:17-jdk
MAINTAINER 2024tm93139
COPY target\DevopsPractice-1.0.jar DevopsPractice-1.0.jar
ENTRYPOINT ["java","-jar","DevopsPractice-1.0.jar"]