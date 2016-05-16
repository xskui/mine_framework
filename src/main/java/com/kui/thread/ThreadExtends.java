package com.kui.thread;

/**
 * Created by xingshukui.
 * Date: 2016/5/14.
 * Desc:
 */
public class ThreadExtends extends Thread {

    private String name;

    public ThreadExtends(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExtends("A"));
        t.start();
       /* try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        new Thread(new ThreadExtends("b")).start();
    }
}
