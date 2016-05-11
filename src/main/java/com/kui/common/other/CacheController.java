package com.kui.common.other;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xingshukui on 2016/5/9.
 */
@Controller
@RequestMapping("cache/")
public class CacheController {

    @RequestMapping("cacheMethod")
    public void cacheMethod(){
        System.out.println("test");
    }
}
