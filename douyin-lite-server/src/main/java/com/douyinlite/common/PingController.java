package com.douyinlite.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PingController {

    @GetMapping("ping")
    public ApiResult<String> ping(){
        return ApiResult.success("pong");
    }
}
