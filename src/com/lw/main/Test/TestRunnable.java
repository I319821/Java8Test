package com.lw.main.Test;

import static java.lang.Thread.sleep;

public class TestRunnable {

    static public void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("This is thread1...");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread thread2 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("This is thread2..");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();



    }
}
