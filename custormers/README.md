./gradlew build
docker build -t customers . 
docker tag customer lelodois/customer 
docker login
docker tag customers lelodois/customers:1
docker push  lelodois/customers:1