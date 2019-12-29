package com.eureka.provider.gener.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eureka.provider.gener.entity.EUser;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenss
 * @since 2019-12-29
 */
@Repository
public interface EUserMapper extends BaseMapper<EUser> {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    EUser load(long id);

}
