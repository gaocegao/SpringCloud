package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//1.指定服务名
@FeignClient(value = "service-hi")
public interface FeignService {

    @GetMapping("/hi")
    String sayHello(@RequestParam(value = "name") String name);

}
