/*
 * @(#) NacosServer
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2021
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author Administrator
 * <br> 2021-02-19 17:01:36
 */

package com.cloudserver.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

public class NacosServer {
    public static void main(String[] args) {
    }

    @Slf4j
    @RestController
    static class TestController {
        @GetMapping("/hello")
        public Map<String,String> hello(@RequestParam String name) {
            log.info("invoked name = " + name);
            Map<String,String> map=new HashMap<>();
            map.put("姓名",name);
            return map;
        }
        @GetMapping("/hello2")
        public String hello2(@RequestParam String name) {
            log.info("invokek2 name = " + name);
            return "hello2 " + name;
        }
    }
}

