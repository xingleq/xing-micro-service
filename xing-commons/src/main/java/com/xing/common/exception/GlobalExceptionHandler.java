package com.xing.common.exception;

/**
 * @author qzexing
 * @version 1.0
 * @date 2022/4/8 16:41
 */

import com.xing.common.api.Result;
import com.xing.common.api.ResultCode;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * Created by macro on 2020/2/27.
 */
@ControllerAdvice("com.xing")
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e) {
        return Result.validateFailed();
    }

    /**
     * 参数不匹配异常
     */
    @ResponseBody
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Result methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e, BindingResult result) {
        String msg = ResultCode.PARAM_ERROR.getMsg();
        if (result != null && result.getFieldError() != null) {
            msg = result.getFieldError().getDefaultMessage();
        }
        return Result.validateFailed(msg);
    }


    @ExceptionHandler(value = {MissingServletRequestParameterException.class})
    @ResponseBody
    public Result missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException ex, HttpServletRequest request) {
        return Result.validateFailed();
    }


    @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
    @ResponseBody
    public Result methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {
        return Result.validateFailed();
    }

    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
    @ResponseBody
    public Result httpMessageNotReadableException(HttpMessageNotReadableException ex, BindingResult result) {
        return Result.validateFailed();
    }

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public Result bindException(BindException ex) {
        return Result.validateFailed();
    }


}