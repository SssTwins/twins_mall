package pers.shb.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class TwinsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwinsGatewayApplication.class, args);
    }

}
