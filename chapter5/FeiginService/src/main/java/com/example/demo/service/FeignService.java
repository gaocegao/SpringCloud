package com.example.demo.service;

import com.example.demo.service.Impl.FeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//1.指定服务名
@FeignClient(value = "service-hi",fallback =FeignServiceImpl.class )
public interface FeignService {

    @GetMapping("/hi")
    String sayHello(@RequestParam(value = "name") String name);

}
