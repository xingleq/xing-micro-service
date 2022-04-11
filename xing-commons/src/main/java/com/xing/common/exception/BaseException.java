package com.xing.common.exception;

/**
 * 基础异常
 *
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 15:52
 */
public class BaseException extends RuntimeException {

    protected int code;

    protected String msg;

    public BaseException() {
        super();
    }

    public BaseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BaseException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
}
