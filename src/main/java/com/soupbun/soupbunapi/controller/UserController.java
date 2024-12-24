package com.soupbun.soupbunapi.controller;

import com.soupbun.soupbunapi.SoupbunApiApplication;
import com.soupbun.soupbunapi.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    // 获取日志记录器
    private static final Logger LOG = LogManager.getLogger(SoupbunApiApplication.class);

    @GetMapping("/get")
    public String getUser(@RequestParam Long id) {
        LOG.info("info 级别日志 ...");
        LOG.warn("warn 级别日志 ...");
        LOG.error("error 级别日志 ...");
        LOG.fatal("fatal 级别日志 ...");
        return "Hello World";
    }
}
