package com.eureka.provider.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * hello
 */
@Data
public class HelloVo {

    private String greeting;

    private Date today;
}
