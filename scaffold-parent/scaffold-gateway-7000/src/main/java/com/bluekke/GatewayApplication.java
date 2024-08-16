package com.bluekke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description for this class
 *
 * @Author will
 * @create 2024/8/16 18:11
 */
@SpringBootApplication(scanBasePackages = {"com.bluekke"})
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
