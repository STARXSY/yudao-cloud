package cn.iocoder.mall.managementweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"cn.iocoder.mall.productservice.rpc","cn.iocoder.mall.payservice.rpc"
,"cn.iocoder.mall.promotion.api.rpc","cn.iocoder.mall.systemservice.rpc","cn.iocoder.mall.userservice.rpc"})
public class ManagementWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementWebApplication.class, args);
    }

}
