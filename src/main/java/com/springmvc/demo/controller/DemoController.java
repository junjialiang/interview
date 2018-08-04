package com.springmvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LIANGJUNJIA on 2018/4/28.
 */
@Controller
public class DemoController {

    // 根据环境读取不同的属性值
    @Value("${profiles.active}")
    private String profilesActive;

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/index")
    public String hello() {
        logger.error("env: " + profilesActive);
        logger.error("controller: hello");
        return "index";
    }
}
