package com.vincent.mall.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合Mybatis-plus
 *      1)、导入依赖
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2）、配置
 *          1、配置数据源
 *              1.1)、导入数据库驱动
 *              1.2）、在application.yml 配置数据源相关信息
 *          2、配置Mybatis-plus
 *              2.1)、使用MapperScan
 *              2.2)、告诉Mybatis-plus,sql映射文件位置
 */
@MapperScan("com.vincent.mall.mallproduct.dao ")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
