package com.sven.RpcClient;

import com.sven.api.HelloService;
import com.sven.client.RpcProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weixiao.ll on 17/2/9.
 */
public class HelloClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloClient.class);
    public static void main(String [] args) {
        LOGGER.debug("start HelloClient");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy proxy = context.getBean(RpcProxy.class);
        HelloService helloService = proxy.create(HelloService.class);
        String s = helloService.hello("world");
        System.out.println(s);
    }
}
