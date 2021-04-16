package com.vincent.mall.mallcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用nacos作为配置中心统一管理
 *      1）、引入依赖
 *      <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *      2）、创建一个bootstrap.properties,配置如下两项
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *          spring.application.name=mall-coupon
 *      3）、需要给配置中心默认添加一个叫数据集（Data Id）mall-coupon.properties,默认规则：应用名.properties
 *      4）、给应用名.properties添加任何配置
 *      5）、动态获取配置
 *          @RefreshScope：动态获取并刷新配置
 *          @Value(""${配置项的名})：获取到配置
 *          如果配置中心和当前项目的配置文件都配置了相同的项，优先使用中心的配置
 * 2、细节
 *      1）、命名空间：配置隔离
 *          默认：public(保留空间)，默认新增的所有配置都在public空间
 *          1.1）、 开发、测试、生产利用命名空间做环境隔离
 *                  注意：在bootstrap.properties配置上、需要使用哪个命令名空间下的配置
 *                  spring.cloud.nacos.config.namespace=1b0191f0-19f3-4784-a8b1-474c5d3d244a[命名空间的id]
 *          1.2）、每一个微服务之间互相隔离，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *      2）、配置集：所有配置的集合
 *      3）、配置集ID：类似文件名
 *          DataId：类似文件名
 *      4）、配置组
 *          默认所有的配置集都属于：DEFAULT_GROUP
 *  每个微服务创建自己的命名空间，使用配置分组区分环境配置：test、prod、test
 *      5）、同时加载多个配置集
 *          5.1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *          5.2）、只需要在bootstrap.properties说明加载哪些配置文件即可
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
