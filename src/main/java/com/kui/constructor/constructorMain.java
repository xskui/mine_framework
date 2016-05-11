package com.kui.constructor;

/**
 * Created by xingshukui on 2016/4/28.
 */
public class constructorMain {

    public constructorMain(int a,String str) {
        System.out.println(a+"----"+str);
    }

    public constructorMain(int a) {
        System.out.println(a);
    }

    public constructorMain() {
        this(1);
    }

    public static void main(String[] args) {
        System.out.println(9 & 9);
        System.out.println(9 | 3);
        System.out.println(6 % 3);
        //System.out.println(new constructorMain().hash(1270));
    }
    public int hash(int key) {
        return (key & 2147483647) % 100;
    }
}
