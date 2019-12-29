package com.eureka.provider.gener.controller;


import com.eureka.provider.common.base.RES;
import com.eureka.provider.common.util.SnowflakeIdWorker;
import com.eureka.provider.gener.entity.EUser;
import com.eureka.provider.gener.mapper.EUserMapper;
import com.eureka.provider.gener.service.IEUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenss
 * @since 2019-12-29
 */
@Slf4j
@RestController
@RequestMapping("/user/e-user")
@Api(description = "user服务操作类")
public class EUserController {

    @Autowired
    private IEUserService ieUserService;

    @Autowired
    private EUserMapper eUserMapper;

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    @PostMapping("saveUser")
    @ApiOperation("新增用户")
    public RES<EUser> saveUser(@RequestBody EUser eUser){
        Boolean flag = ieUserService.save(eUser.setViewId(String.valueOf(snowflakeIdWorker.nextId())));
        if(flag){
            return RES.ok(eUser);
        }else {
            return RES.fail("fail");
        }
    }

    @ApiOperation("查询用户")
    @GetMapping("load")
    public RES<EUser> load(@RequestParam("id") Long id ){
        EUser eUser = eUserMapper.load(id);
        return RES.ok(eUser);
    }

}
