package com.kui.thread;

import java.util.Random;

/**
 * Created by xingshukui on 2016/4/11.
 */
public class PrintTask implements Runnable{
    private String name;
    private Object prev;
    private Object self;

    public PrintTask(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count>0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(this.name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
