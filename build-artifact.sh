./gradlew build
docker build --build-arg JAR_FILE=build/libs/\*.jar -t dc-lab9 .