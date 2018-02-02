# RpcServer

### 简易 rpc demo 服务端框架
运行方式

1. 配置impl下rpc.properties 中的ip地址，客户端通过该ip地址进行连接。
2. 在api中声明服务端提供的接口。
3. 在impl中实现该服务接口。
4. 将api中的接口打成jar包，以提供给客户端使用。
5. 运行impl下的RpcBootstrap，启动rpc服务。

[客户端demo地址](https://github.com/classli/RpcClient)