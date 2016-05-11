package com.kui.hash;

/**
 * HashMap中确定桶位置的函数，
 * 当应用数据分布在等差数列集合(如偶数集)上时，如果恰好公差与桶容量有公约数n时，碰撞严重
 * 下面输出结果
 * 97
 * 1
 * 98
 * 0
 * 99
 * 1
 * 所以HashMap会对取得hashcode重新散列
 * Created by xingshukui on 2016/4/28.
 */
public class hashMain {

    public static int indexFor(int h,int length){
        return h & (length-1);
    }

    public static void main(String[] args) {
        String key = "a";
        System.out.println(key.hashCode());
        System.out.println(indexFor(key.hashCode(),2));

        String key1 = "b";
        System.out.println(key1.hashCode());
        System.out.println(indexFor(key1.hashCode(),2));

        String key2 = "c";
        System.out.println(key2.hashCode());
        System.out.println(indexFor(key2.hashCode(),2));

    }
}
