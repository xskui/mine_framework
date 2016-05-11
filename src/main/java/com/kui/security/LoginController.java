package com.kui.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author: xingshukui.
 * date:2016/4/5.
 */
@Controller
@RequestMapping("security")
public class LoginController {
    private static final String  login_page = "/site/login.jsp";
    private static final String  denied_page = "/site/refusePage.jsp";

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Login(){
        return login_page;
    }

    @RequestMapping(value = "/denied",method = RequestMethod.GET)
    public String deniedPage(){
        return denied_page;
    }
}
