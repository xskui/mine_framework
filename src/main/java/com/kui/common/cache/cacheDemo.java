package com.kui.common.cache;

/**
 * author: xingshukui.
 * date:2016/4/2.
 */
public class cacheDemo {

    public static void main(String[] args) {
        cacheUtil util = new cacheUtil();
        util.addToCache("name",new String("myCache") );
        System.out.println(util.getCacheElement("name"));
    }
}
