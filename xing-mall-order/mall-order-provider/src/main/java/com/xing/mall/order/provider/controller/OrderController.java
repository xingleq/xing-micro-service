package com.xing.mall.order.provider.controller;

import com.xing.common.api.Result;
import com.xing.mall.order.provider.param.OrderParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 16:24
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @PostMapping("/add")
    public Result add(@RequestBody @Validated OrderParam orderParam) {

        System.out.println("-------------");
        return Result.success();
    }

    @PostMapping("/test")
    public Result test() {
        System.out.println("test");
        return Result.success();
    }

}
