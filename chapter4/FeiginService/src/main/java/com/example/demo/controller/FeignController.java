package com.example.demo.controller;

import com.example.demo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    FeignService feignService;

    @GetMapping("/hi")
    public  String index(@RequestParam(value = "name") String name){
        return feignService.sayHello(name);
    }
}
