package com.xing.common.exception;

/**
 * 数据验证异常
 *
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 15:58
 */
public class ValidException extends BaseException {

    public ValidException() {
        super();
    }

    public ValidException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ValidException(int code, String msg) {
        super(code, msg);
        this.msg = msg;
        this.code = code;
    }
}
