package com.sven.impl;

import com.sven.api.HelloService;
import com.sven.server.RpcService;

/**
 * Created by weixiao.ll on 17/2/5.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}
