package com.vinay.labcode.threads;

public class MultiThread {

    public static void main(String[] args) {
        new NewThread();
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: "+i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.err.println("Main Thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
