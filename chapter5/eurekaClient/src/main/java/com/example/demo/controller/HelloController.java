package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String index(@RequestParam(value = "name") String name){
        return "Hi:"+name+",I'm from "+port;
    }
}
