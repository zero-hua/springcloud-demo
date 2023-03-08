# Spring Cloud Demo

这是一个后端Java项目，基于Spring Boot和Spring Cloud以及Spring Cloud Alibaba。它是我个人用来学习Spring Cloud时所编写的demo项目集合。使用alibaba的sentinel来控制流量。使用alibaba的nacos来做注册中心。Netflix Feign实现远程服务调用。Ribbon 实现了客户端的负载均衡。同时也尝试了Eureka来实现服务注册与发现组件。Hystrix来实现服务熔断与降级。RabbitMQ来实现消息队列。项目使用IDEA进行编写。

## 

## 使用方法

### 环境要求

- Java 8或更高版本
- Maven 3.0或更高版本

### 构建和运行

1. 克隆该项目到本地。

```
bash
git clone https://github.com/[your-username]/spring-cloud-alibaba-demo.git
```

1. 进入项目根目录，构建项目。

```
java
cd spring-cloud-demo
mvn clean package
```

1. 运行Nacos Server。

下载Nacos Server：https://github.com/alibaba/nacos/releases

进入nacos/bin目录，启动Nacos Server。

```

sh startup.sh -m standalone
```

1. 运行Sentinel Dashboard。

下载Sentinel Dashboard：https://github.com/alibaba/Sentinel/releases

进入sentinel-dashboard目录，启动Sentinel Dashboard。

```

java -jar sentinel-dashboard.jar
```

1. 运行各个服务。

进入各个服务的目录，执行以下命令。

```

java -jar target/*.jar
```

### 访问服务

访问服务的URL格式为：`http://localhost:{port}/{service}/{path}`。

例如，访问订单服务的URL为：`http://localhost:9001/order-service/{path}`。

## 技术栈

- Spring Boot
- Spring Cloud
- Spring Cloud Alibaba
- Netflix Feign
- Ribbon
- Eureka
- Hystrix
- RabbitMQ

## 参考资料

- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [Spring Cloud介绍](https://spring.io/projects/spring-cloud)