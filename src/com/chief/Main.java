package com.chief;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Thread.activeCount()); // no of active threads

        MyThread threada=new MyThread();
        threada.setDaemon(false);
        threada.start();

       //   ` System.out.println(Thread.activeCount());
    }
}
