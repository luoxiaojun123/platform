package com.xiaojun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojun
 * @date 2019/2/22 23:11
 */
@RestController
public class ServiceController {


    @GetMapping("/test_zull")
    public String test(){
        return "zull success";
    }
}
