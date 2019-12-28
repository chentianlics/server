package com.eureka.provider.controller;

import com.eureka.provider.common.api.HelloApi;
import com.eureka.provider.common.vo.HelloVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/api/v1/provider/")
@Api(description = "hello服务操作类")
public class HelloController implements HelloApi {

    @PostMapping("hello")
    public String hello(@RequestBody HelloVo helloVo){
        return helloVo.getGreeting()+"今天是："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(helloVo.getToday())+"我是提供者！";
    }
}
