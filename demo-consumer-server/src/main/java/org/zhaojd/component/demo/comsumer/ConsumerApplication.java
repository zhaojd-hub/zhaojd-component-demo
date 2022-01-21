package org.zhaojd.component.demo.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**
 * @author jdzhao2
 */
@EnableEurekaClient
@EnableApolloConfig
@EnableFeignClients(basePackages = {"org.zhaojd.**.client"})
@SpringBootApplication(scanBasePackages = {"org.zhaojd"})
public class ConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
    
}
