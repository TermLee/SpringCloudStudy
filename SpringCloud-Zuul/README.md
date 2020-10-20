##ZUUL
Zuul is an L7 application gateway that provides capabilities for dynamic routing, monitoring, resiliency, security, and more. Please view the wiki for usage, information, HOWTO, etc https://github.com/Netflix/zuul/wiki
###1.添加依赖包
```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka</artifactId>
            <version>1.4.6.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-zuul</artifactId>
            <version>1.4.6.RELEASE</version>
        </dependency>
```
###2.将网关服务注册到注册中心（eureka）
```yaml
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8002/eureka/,http://eureka2:8003/eureka/,http://eureka3:8004/eureka/
  instance:
    instance-id: zuul9527.com
    prefer-ip-address: true

info:
  app.name: TermStudySpringCloud
  company.name: www.term.com
  version: 1.2
```
###3.添加Zuul配置，自定义路径，隐藏微服务信息
```yaml
zuul:
  # 不让用户使用微服务名字直接访问
  ignored-services: springcloud-provider
  routes:
    mydept.serviceId: springcloud-provider
    mydept.path: /mydept/**


  #设置访问前缀,只有term路径下的地址才能被访问，其他被忽略
#  ignored-services: "*"
#  prefix: /term
```

###4.更改hosts文件，自定义服务器名（可选操作）
###5.编写启动类，添加@EnableZuulProxy
访问方式：http://[服务器地址]:9527/mydept/**