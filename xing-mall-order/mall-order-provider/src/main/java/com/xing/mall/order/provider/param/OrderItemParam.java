package com.xing.mall.order.provider.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 16:33
 */
@Data
public class OrderItemParam implements Serializable {

    private String orderItemId;

    private int num;

}
