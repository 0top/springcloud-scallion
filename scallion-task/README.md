## 简介

    本模块包含各种项目所需执行的任务
    包含定时任务，通知任务，统计任务等

## 规划

- 固定任务可以直接数据库配置,统一实现任务接口/抽象类
- 配置型任务使用dag做任务依赖
- 通知任务,服务监听队列消息，根据消息执行对应任务
    e.g 活动投票结束,接受到通知进行统计任务

## 技术

- dexecutor
    执行依赖任务

- springbatch
    多线程读取写入数据

- quartz
    各类定时任务，通过数据库中配置触发类型，触发时间
 
## 具体task

    psychokinesis任务：
        使用dag实现下述依赖任务
        1. 调用ScallionDataProvider进行数据生成
        2. 调用WebPsychokinesis进行数据统计
        

