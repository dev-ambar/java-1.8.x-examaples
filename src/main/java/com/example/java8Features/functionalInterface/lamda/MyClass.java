package com.example.java8Features.functionalInterface.lamda;

public class MyClass {
    
        public static void main(String[] args) {
             
            Runnable run = () -> {
            
            for( int i = 1 ; i<10; i++)
            {System.out.println("Hello"+ i);}
        };

        Thread myThread = new Thread(run);
         myThread.start();
        
    }

}
