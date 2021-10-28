for i in spring-hello spring-blog spring-admin
do
cd $i
./mvnw clean package -DskipTests
cd ..
done