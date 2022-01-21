# 微服务框架示例工程

# 目录说明
- demo-parent: 父目录即为演示项目的parent。
- demo-gateway：演示用的网关，测试及生产环境需要部署网关集群。
- demo-provider：演示用微服务1，提供接口给consumer调用，同时可通过gateway暴露对外api。
- demo-consumer：演示用微服务2，调用provider接口，同时通过gateway暴露对外api。

# 调用链路

可演示以下调用链路：
- gateway -> provider
- gateway -> consumer
- consumer -> provider
- gateway -> consumer -> provider

# 演示项目覆盖功能
- 数据库组件、redis组件使用