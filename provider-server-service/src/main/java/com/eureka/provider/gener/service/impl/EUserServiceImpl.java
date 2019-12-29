package com.eureka.provider.gener.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eureka.provider.gener.entity.EUser;
import com.eureka.provider.gener.mapper.EUserMapper;
import com.eureka.provider.gener.service.IEUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenss
 * @since 2019-12-29
 */
@Service
public class EUserServiceImpl extends ServiceImpl<EUserMapper, EUser> implements IEUserService {

}
