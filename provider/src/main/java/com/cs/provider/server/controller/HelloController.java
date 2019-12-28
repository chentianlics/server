package com.cs.provider.server.controller;

import com.cs.common.vo.Hello;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/provider/")
public class HelloController {

    @PostMapping("hello")
    public String hello(@RequestBody Hello hello){
        return hello.getGreeting()+"今天是"+hello.getToday().toString();
    }
}
