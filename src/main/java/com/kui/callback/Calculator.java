package com.kui.callback;

/**
 * Created by xingshukui on 2016/4/25.
 */
public class Calculator {
    public void add(int a,int b,Student student){
        student.fillBlank(a,b,a+b);
    }
}
