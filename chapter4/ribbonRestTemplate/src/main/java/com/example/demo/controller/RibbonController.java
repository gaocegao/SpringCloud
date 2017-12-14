package com.example.demo.controller;

import com.example.demo.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RibbonController {
    @Autowired
    RibbonService ribbonService;

   @GetMapping("/hi")
    public  String index(@RequestParam(value = "name") String name){
       return ribbonService.sayHello(name);
   }

}
