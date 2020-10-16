package com.zzf.common.entity;

import java.io.Serializable;

/**
 *
 * 后端传递数据给前端的通用格式
 *
 * @author ZZF
 * @date 2020/8/21
 */


public class ResultGenerator<T> implements Serializable {

    private int status;
    private String message;
    private T data;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    private ResultGenerator(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private ResultGenerator(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private ResultGenerator(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> ResultGenerator<T> createBySuccess() {
        return new ResultGenerator<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc());
    }


    public static <T> ResultGenerator<T> createBySuccess(String message, T data) {
        return new ResultGenerator<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ResultGenerator<T> createBySuccess(int code, String message){
        return new ResultGenerator<T>(code, message);
    }

    public static <T> ResultGenerator<T> createBySuccess(int code, T data) {
        return new ResultGenerator<T>(code, data);
    }

    public static <T> ResultGenerator<T> createBySuccess(T data) {
        return new ResultGenerator<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), data);
    }

    public static <T> ResultGenerator<T> createByError(int code, String message) {
        return new ResultGenerator<T>(code, message);
    }

}
