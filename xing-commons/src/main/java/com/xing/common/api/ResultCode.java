package com.xing.common.api;

/**
 * 返回数据枚举
 *
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 15:28
 */
public enum ResultCode {

    SUCCESS(0, "操作成功"),

    FILED(1, "操作失败"),

    PARAM_ERROR(2,"参数错误"),

    UNAUTHORIZED(401, "未认证"),

    FORBIDDEN(403, "未授权"),

    VALIDATE_FAILED(404, "未找到相关资源"),

    SERVER_ERROR(500, "系统异常");


    private final Integer code;
    private final String msg;

    private ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
