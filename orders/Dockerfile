FROM eclipse-temurin:21

COPY build/libs/*.jar /home/appuser/app.jar

ENTRYPOINT ["java", \
    "-server", \
    "-XX:+UseContainerSupport", \
    "-XX:+UseStringDeduplication", \
    "-XX:G1ReservePercent=10", \
    "-XX:+UseG1GC", \
    "-XX:ParallelGCThreads=3", \
    "-XX:ConcGCThreads=3", \
    "-XX:InitiatingHeapOccupancyPercent=60", \
    "-XX:MaxGCPauseMillis=100", \
    "-XX:InitialRAMPercentage=75", \
    "-XX:MaxRAMPercentage=75", \
    "-Djava.security.egd=file:/dev/./urandom", \
    "-Dcom.sun.management.jmxremote.ssl=false", \
    "-Dcom.sun.management.jmxremote.authenticate=false", \
    "-Dcom.sun.management.jmxremote.port=5555", \
    "-jar", \
    "/home/appuser/app.jar"]