package csx.demo.dubbodemoconsumer;

import csx.demo.dubbo.dubbodemofacade.MyService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubbodemoConsumerApplicationTests {

    @Reference(version = "1.0.0")
    private MyService myService;

    @Test
    void contextLoads() {
        System.out.println(myService.getusername("csx"));
    }


    @Test
    void test1(){

    }

    @Test
    void test1(){
        System.out.println("test1");
    }


}
