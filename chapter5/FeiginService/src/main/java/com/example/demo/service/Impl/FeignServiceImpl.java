package com.example.demo.service.Impl;

import com.example.demo.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHello(String name) {
        return "sorry:"+name+"-服务崩溃了..";
    }
}
