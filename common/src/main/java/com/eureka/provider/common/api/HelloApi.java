package com.eureka.provider.common.api;

import com.eureka.provider.common.vo.HelloVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * hello api
 */
@Api(tags = "hello服务操作类")
public interface HelloApi {

    @PostMapping(value = "/api/v1/provider/hello")
    @ApiOperation(value = "hello",httpMethod = "POST",notes = "hello")
    @ApiImplicitParam(name = "helloVo",value = "vo",required = true,dataType = "HelloVo")
    String hello(@RequestBody HelloVo helloVo);
}
