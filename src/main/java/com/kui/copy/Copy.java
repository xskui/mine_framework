package com.kui.copy;

/**
 * Created by xingshukui.
 * Date: 2016/5/11.
 * Desc:
 */
public class Copy {
    public static void main(String[] args) {
        String a = "a";
        String b = a;
        a = change(a);
        System.out.println(a+"====>"+b);
    }
    public static String change(String str){
        return str.toUpperCase();
    }
}
