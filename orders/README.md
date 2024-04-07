./gradlew build
docker build -t orders .
docker tag orders lelodois/orders
docker login
docker tag orders lelodois/customers:1
docker push  lelodois/orders:1