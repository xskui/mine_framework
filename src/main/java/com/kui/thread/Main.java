package com.kui.thread;

/**
 * Created by xingshukui on 2016/4/11.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("create threads");

        Thread thread1 = new Thread(new PrintTask("task1"));
        Thread thread2 = new Thread(new PrintTask("task2"));
        Thread thread3 = new Thread(new PrintTask("task3"));

        System.out.println("start tasks");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
