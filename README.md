# HunterBoot5_Dubbo

Springboot + Dubbo + zookeeper 搭建的 Demo。


项目使用组件的版本：
1. Springboot版本 2.3.5.RELEASE, Dubbo 版本为 0.2.0, zookeeper-3.8.0, JDK 1.8+

zookeeper 使用docker 进行搭建：

1.首先执行 docker pull zookeeper, 
2.pull 成功后，使用docker images 名称为 zookeeper 。
3.执行 docker run  -d -p 2181:2181 --name zookeeper_1  --restart always  zookeeper 执行zookeeper。

![image](https://user-images.githubusercontent.com/22415416/166179559-79d56619-9776-4e48-9f9b-ad82dd912595.png)

4. 进入 zookeeper 容器中：
docker exec -it zookeeper_1  /bin/bash

5. 进入 bin 目录下启动zookeeper 客户端服务：zkCli.sh：

![image](https://user-images.githubusercontent.com/22415416/166179789-37945d0d-ec59-4e85-a292-7e40ec3eb23c.png)

6. 先启动 provider 服务方接口信息，后启动 consumer 消费方。
启动成功后可以看见 zookeeper 中存在 dubbo 节点：

7. 在chrome 中发起请求 Controller 成功。
