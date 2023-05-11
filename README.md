# springcloud-scallion

    使用springcloud为技术栈的项目
    项目版本选取 https://start.spring.io/actuator/info
               https://github.com/alibaba/spring-cloud-alibaba/wiki/版本说明

# 技术栈

- base:  
    -[x] java11 (待升级java17)  
    -[x] springboot  
    -[x] springcloud  
    -[x] mybatis  

- task:
    -[x] dag  
    -[ ] springbatch  
    -[x] quartz

- data:
    -[x] mysql  
    -[ ] elasticseach
    -[ ] flink
    -[ ] clinkhouse
    -[ ] mongodb

- queue:
    -[x] rabbitmq
    -[ ] kafka
    -[ ] disruptor
  
- other:
    -[x] swagger3
  
- docker：
    -[ ] docker-compose  
        scallion-3trd包中存储docker-compose文件及介绍

## 规划

-[x] 网关
    netty
-[ ] 任务(含依赖任务)
-[ ] 业务
-[ ] 监控
    prometheus

## nginx 

- 负载均衡： nignx中的upstream有个backup实现

## spring-cloud-alibaba

nacos-server: 1.4.2
    需要使用spring-cloud.alibaba.version=2.2.6.RELEASE
    2.2.7.RELEASE 则对应nacos客户端2.x版本,主要是gRPC协议更新影响

seata
    通过seate完成分布式事物