./gradlew build
docker build -t orders .
docker tag orders lelodois/orders
docker tag orders lelodois/orders:3 --push
docker push  lelodois/orders:3