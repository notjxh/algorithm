package com.jxh.algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlgorithmApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestController.class, args);
    }


    @RequestMapping("/test")
    public String test(String test){
        return "hello"+test;
    }
}
