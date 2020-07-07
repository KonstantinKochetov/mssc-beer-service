# Spring Boot Microservice

1. run jms docker:
docker run -it --rm \
  -p 8161:8161 \
  -p 61616:61616 \
  vromero/activemq-artemis

2. run zipkin docker:
docker run -d -p 9411:9411 openzipkin/zipkin

3. run all services (start with eureka, config, gateway, and then the rest) 
