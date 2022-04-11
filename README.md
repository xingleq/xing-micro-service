# xing-micro-service 个人微服务

### 模块及端口占用情况

| 模块名称                    | 占用端口 | 模块描述                     |
|-------------------------|------|--------------------------|
| xing-register           | 8761 | eureka 注册中心              |
| xing-gateway            | 8080 | spring Cloud Gateway 网关  |
| xing-config             | 9000 | spring Cloud Config 配置中心 |
| xing-commons            |      | 通用工具包                    |
| xing-mall-order         |      | 订单服务模块                   |
| ├─  mall-order-api      |      | 订单服务API                  |
| ├─  mall-order-provider | 8000 | 订单服务提供者                  |
| xing-mall-goods         |      | 商品服务模块                   |
| ├─  mall-goods-api      |      | 订单服务API                  |
| ├─  mall-goods-provider | 8100 | 订单服务提供者                  |

