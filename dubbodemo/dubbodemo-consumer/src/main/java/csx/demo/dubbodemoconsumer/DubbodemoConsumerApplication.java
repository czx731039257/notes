package csx.demo.dubbodemoconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfig
@SpringBootApplication
public class DubbodemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbodemoConsumerApplication.class, args);
    }

}
