package com.xing.mall.order.provider.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 16:30
 */
@Data
public class OrderParam implements Serializable {

    @NotNull(message = "姓名不能为空")
    private String name;

    @Size(min = 11,max = 11,message = "手机号不正确")
    @NotNull(message = "电话不能为空")
    private String tel;

    private String userId;

    @NotEmpty(message = "订单项不能为空")
    private List<OrderItemParam> orderItems;

}
