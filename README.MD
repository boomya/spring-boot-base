### 基于spring boot的web类型项目模板
#### spring boot + mybatis + dubbo
#### 使用说明
1. clone代码
```bash
git clone https://github.com/boomya/spring-boot-base.git
```
2. 替换repository下jdbc.properties中数据库相关的配置
```
spring.datasource.jdbc.url=
spring.datasource.jdbc.username=
spring.datasource.jdbc.password=
```
3. 编译
```bash
cd spring-boot-base
mvn clean package -Dmaven.test.skip=true
```

4. 部署
```bash
cd web/target
java -jar base-web-1.0-SNAPSHOT.jar
```

#### 整合dubbo
service模块作为dubbo服务的提供方  
web模块作为dubbo服务的消费方  
client模块是dubbo服务的开放接口  
1. 修改web模块下的pom文件, 注释掉service的依赖, 增加client的依赖
```
......
<!-- 调用dubbo接口, 将下面的依赖注释掉 -->
<!--<dependency>-->
<!--<groupId>com.boom.base</groupId>-->
<!--<artifactId>base-service</artifactId>-->
<!--<version>1.0-SNAPSHOT</version>-->
<!--</dependency>-->
<dependency>
    <groupId>com.boom.base</groupId>
    <artifactId>base-client</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
......       
```
2. 启动service提供dubbo服务
3. 启动web测试dubbo服务