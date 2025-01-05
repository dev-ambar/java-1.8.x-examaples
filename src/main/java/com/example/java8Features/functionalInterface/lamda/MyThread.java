package com.example.java8Features.functionalInterface.lamda;

/* creating Thread class using Runnable interface (it is also a functional interface with one  abstract method void run())
 * given way we implement Runnable interface override therun method given our logicand use it 
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        
        for( int i = 1 ; i<=10 ;i++)
        {
            System.out.println("thread"+i);
        }
    }

     public static void main(String[] args) {
         
        // createthe instance of Runable  implement  class as task.
         MyThread myThread = new MyThread(); 
         // pass thisd task in to thread class to execute it .    
         Thread thread1 = new Thread(myThread);
           thread1.run();
        
     }

}
