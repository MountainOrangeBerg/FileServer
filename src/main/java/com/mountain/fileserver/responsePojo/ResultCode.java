package com.mountain.fileserver.responsePojo;

/**
 * @Description:
 * @author: 夜七天
 * @create: 2021/08/07 15:07
 */
public enum ResultCode {

    SUCCESS(200, "成功"),
    ;

    private Integer code;

    private String msg;

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
