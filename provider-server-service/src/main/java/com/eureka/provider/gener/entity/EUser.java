package com.eureka.provider.gener.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenss
 * @since 2019-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="EUser对象", description="")
public class EUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id",hidden = true)
    private Integer id;

    @ApiModelProperty(value = "view-id")
    private String viewId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "0正常，1锁定，2删除")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "用户图像")
    private String image;


}
