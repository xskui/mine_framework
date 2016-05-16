package com.kui.thread;

/**
 * Created by xingshukui.
 * Date: 2016/5/14.
 * Desc:
 */
public class RunnableImpl implements Runnable {
    private String name;
    private Object prev;
    private Object self;


    public RunnableImpl(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
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

    public static void main(String[] args) throws InterruptedException {

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        RunnableImpl pa = new RunnableImpl("A", c, a);
        RunnableImpl pb = new RunnableImpl("B", a, b);
        RunnableImpl pc = new RunnableImpl("C", b, c);


        new Thread(pa).start();
        //确保按顺序A、B、C执行
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
