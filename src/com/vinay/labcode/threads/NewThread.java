package com.vinay.labcode.threads;

public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread : " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.err.println("Child Thread Interrupted");
        }
        System.out.println("Exiting child thread.");
    }
}
