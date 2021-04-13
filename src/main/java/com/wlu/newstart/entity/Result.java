package com.wlu.newstart.entity;

import com.wlu.newstart.constant.ResultCodeEnum;

import java.io.Serializable;

/**
 * 对外暴露接口的返回值对象
 *
 * @author: wlu
 * @created: 2021/04/13 10:41
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 15869325700230991L;

    private int code;

    private String msg;

    private boolean status;

    private T data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    protected Result() {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.status = true;
    }

    protected Result(T data) {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.status = true;
        this.data = data;
    }

    protected Result(int code, String msg, T data) {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.status = true;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, String msg, T data, boolean status) {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.msg = ResultCodeEnum.SUCCESS.getMsg();
        this.status = true;
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.status = status;
    }

    public static <T> Result<T> success(T data) {
        return new Result(data);
    }

    public static <T> Result<T> success(T data, String message) {
        return new Result(ResultCodeEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> fail(ResultCodeEnum resultCodeEnum) {
        return new Result(resultCodeEnum.getCode(), resultCodeEnum.getMsg(), (Object)null, false);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result(ResultCodeEnum.ERROR.getCode(), msg, (Object)null, false);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return new Result(code, msg, (Object)null, false);
    }

    public static <T> Result<T> fail(int code, String msg, T data) {
        return new Result(code, msg, data, false);
    }
}
