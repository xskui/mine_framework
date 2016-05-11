package com.kui.thread;

import java.util.Random;

/**
 * Created by xingshukui on 2016/4/11.
 */
public class PrintTask implements Runnable{

    private final int sleepTime;
    private final String taskName;
    private final static Random random = new Random();

    public PrintTask(String taskName) {
        this.taskName = taskName;
        sleepTime = random.nextInt(5000);
    }

    @Override
    public void run() {

        System.out.println("sleep for millisecond "+taskName+"--"+sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.printf(taskName,"exception");
        }
    }
}
