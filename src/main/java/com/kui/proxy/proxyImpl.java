package com.kui.proxy;

/**
 * author: xingshukui.
 * date:2016/4/1.
 */
public class proxyImpl implements proxyInter {

    public void method_1() {
        System.out.println("method_1");
    }

    public void method_2() {
        System.out.println("method_2");
    }

    public String ownMethod(){
        System.out.println("ownmethod");
        return "admin";
    }
}
