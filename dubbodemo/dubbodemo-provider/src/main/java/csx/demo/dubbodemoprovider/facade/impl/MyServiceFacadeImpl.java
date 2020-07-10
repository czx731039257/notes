package csx.demo.dubbodemoprovider.facade.impl;

import csx.demo.dubbo.dubbodemofacade.MyService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;



@Service(interfaceClass = MyService.class,version = "1.0.0")
public class MyServiceFacadeImpl implements MyService {

    @Value("${server.port}")
    String port;

    @Override
    public String getusername(String str) {
        return "端口号="+port+"获取到到username="+str;
    }
}
