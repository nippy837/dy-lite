package com.douyinlite.common;

import lombok.Getter;

@Getter
public enum ErrorCode {

    SUCCESS("200", "成功"),
    BAD_REQUEST("400", "参数错误"),
    USERNAME_EXISTS("1001", "用户名已存在"),
    LOGIN_FAILED("1002", "用户名或密码错误"),
    UNAUTHORIZED("1003", "未登录或登录已过期"),
    USER_DISABLED("1004", "账号已被禁用");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
