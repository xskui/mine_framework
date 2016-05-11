package com.kui.callback;

import org.junit.Test;

/**
 * Created by xingshukui on 2016/4/25.
 */
public class Student {
    private String name;

    public void callHelp(int a,int b){
        new Calculator().add(a,b,this);
    }
    public void fillBlank(int a,int b,int result){
        System.out.println(name+"¼ÆËãÆ÷Ëã³ö"+a+"+"+b+"="+result);
    }
    public Student(String name) {
        this.name = name;
    }
}
