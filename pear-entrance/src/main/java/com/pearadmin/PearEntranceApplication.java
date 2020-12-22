package com.pearadmin;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Describe: 入 口 启 动 类
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
                                  org.activiti.spring.boot.SecurityAutoConfiguration.class,
                                  SecurityAutoConfiguration.class})
@EnableDiscoveryClient
public class PearEntranceApplication {
    public static void main(String[] args)

    {
        SpringApplication.run(PearEntranceApplication.class, args);
    }
}
