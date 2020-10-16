package com.zzf.common.entity;

/**
 * 发送给前端的通用编码
 *
 * @author ZZF
 * @date 2020/8/21
 */

public enum ResultCode {
    SUCCESS(200, "SUCCESS"),
    ERROR(400, "ERROR"),
    INTERNET_ERROR(500, "网络错误!");

    private final int code;
    private final String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
