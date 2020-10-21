#SpringCloud Config Client
1.添加依赖
```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
            <version>2.1.0.RELEASE</version>
        </dependency>
```
2.添加系统配置文件，并配置config服务端的地址，配置文件的名称等信息
```yaml
spring:
  cloud:
    config:
      name: config-client
      profile: dev
      uri: http://localhost:8008
      label: main
```
3.客户端的application.yml只需要配置服务名，可以直接使用远程配置

4.客户端启动类不需要添加注解