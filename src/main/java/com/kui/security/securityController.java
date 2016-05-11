package com.kui.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xingshukui on 2016/4/7.
 */
@Controller
@RequestMapping("User/")
public class securityController {
    private static final String adminPage = "/site/adminPage.jsp";
    private static final String CommonPage = "/site/commonPage.jsp";

    @RequestMapping("admin")
    public String adminUser(){
        return adminPage;
    }

    @RequestMapping("common")
    public String CommonUser(){
        return CommonPage;
    }
}
