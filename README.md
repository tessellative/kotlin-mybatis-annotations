# Kotlin Mybatis Annotation Mapper Example
Rest Service example for Mybatis annotations in Kotlin.

## Setup & Run

### Docker compose to set up the postgresql DB  
docker-compose -f ./docker/db_compose.yml up -d

### Build and Execute
mvn clean package

java -jar target/kotlin-mybatis-annotations-0.0.1-SNAPSHOT.jar

### REST Testing
[Insomnia](https://insomnia.rest/) exported project: [kotlin-mybatis_2018-12-02.har](/insomnia/kotlin-mybatis_2018-12-02.har)

## Sample Database Content:
http://pgfoundry.org/projects/dbsamples/