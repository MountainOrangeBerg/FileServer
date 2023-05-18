package com.mountain.fileserver.responsePojo;

import java.io.Serializable;

/**
 * @Description:
 * @author: 夜七天
 * @create: 2021/08/06 16:10
 */
public class Result<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public Result() {

    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T date) {
        this.data = date;
    }
}
