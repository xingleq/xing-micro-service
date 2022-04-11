package com.xing.common.exception;

/**
 * 数据验证异常
 *
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 15:58
 */
public class BizException extends BaseException {

    public BizException() {
        super();
    }

    public BizException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BizException(int code, String msg) {
        super(code, msg);
        this.msg = msg;
        this.code = code;
    }
}
