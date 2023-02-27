package com.chief;

public class MyThread extends Thread{
    @Override
    public void run(){
      if (this.isDaemon()) {
          System.out.println("This thread");
      }else {
          System.out.println("This is not a daemon thread");
      }
      }
}
