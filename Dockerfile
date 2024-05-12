FROM amazoncorretto:22-alpine3.18-jdk
COPY ./out/production/JavaRewind/ /tmp
WORKDIR /tmp