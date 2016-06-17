### 基于spring boot的web类型项目模板
#### spring boot + mybatis + dubbo
#### 使用说明
1. clone代码
```
git clone https://github.com/boomya/spring-boot-base.git
```
1. 替换repository下jdbc.properties中数据库相关的配置
```
spring.datasource.jdbc.url=
spring.datasource.jdbc.username=
spring.datasource.jdbc.password=
```
2. 编译
```
cd spring-boot-base
mvn clean package -Dmaven.test.skip=true
```

3. 部署
```
cd web/target
java -jar base-web-1.0-SNAPSHOT.jar
```
