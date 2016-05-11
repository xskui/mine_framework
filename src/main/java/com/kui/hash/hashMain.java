package com.kui.hash;

/**
 * HashMap��ȷ��Ͱλ�õĺ�����
 * ��Ӧ�����ݷֲ��ڵȲ����м���(��ż����)��ʱ�����ǡ�ù�����Ͱ�����й�Լ��nʱ����ײ����
 * ����������
 * 97
 * 1
 * 98
 * 0
 * 99
 * 1
 * ����HashMap���ȡ��hashcode����ɢ��
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
