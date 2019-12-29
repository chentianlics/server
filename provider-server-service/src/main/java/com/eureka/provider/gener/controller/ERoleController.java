package com.eureka.provider.gener.controller;


import com.eureka.provider.common.base.RES;
import com.eureka.provider.gener.entity.ERole;
import com.eureka.provider.gener.entity.EUser;
import com.eureka.provider.gener.service.IERoleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenss
 * @since 2019-12-29
 */
@RestController
@RequestMapping("/role/e-role")
@Api(description = "role服务操作类")
public class ERoleController {

    @Autowired
    private IERoleService iERoleService;

    @PostMapping("saveRole")
    public RES<ERole> saveRole(@RequestBody ERole eRole){
        Boolean flag = iERoleService.save(eRole);
        if(flag){
            return RES.ok(eRole);
        }else {
            return RES.fail("fail");
        }
    }
}
