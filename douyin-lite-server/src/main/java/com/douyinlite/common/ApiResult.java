package com.douyinlite.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiResult<T> {

    private String code;
    private String message;
    private boolean success;
    private T data;

    public static <T> ApiResult<T> success(T data){
        return new ApiResult<>(
                ErrorCode.SUCCESS.getCode(),
                ErrorCode.SUCCESS.getMessage(),
                true,
                data
        );
    }

    public static ApiResult<Void> success(){
        return success(null);
    }

    public static <T> ApiResult<T> fail(ErrorCode errorCode){
        return new ApiResult<>(
                errorCode.getCode(),
                errorCode.getMessage(),
                false,
                null
        );
    }

}
