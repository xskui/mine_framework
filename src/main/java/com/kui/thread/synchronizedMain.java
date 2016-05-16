package com.kui.thread;

/**
 * Created by xingshukui.
 * Date: 2016/5/14.
 * Desc:
 */
public class synchronizedMain implements Runnable {


    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }

    public static void main(String[] args) {
        synchronizedMain main = new synchronizedMain();

        Thread t1 = new Thread(main,"A");
        Thread t2 = new Thread(main,"B");

        t1.start();
        t2.start();
    }
}
