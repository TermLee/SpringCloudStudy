#SpringCloud Config

CS结构:服务端负责连接远程仓库获取配置文件；客户端通过服务端获取相应配置

###1.添加服务端依赖
```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
            <version>2.1.1.RELEASE</version>
        </dependency>
    </dependencies>
```

###2.服务端需要配置仓库地址：
```yaml
spring:
  cloud:
    config:
      server:
        git:
          # 仓库地址
          uri: https://github.com/TermLee/springcloud-config
```
###3.服务端启动类需要添加注解@EnableConfigServer