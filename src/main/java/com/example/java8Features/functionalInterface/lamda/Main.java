package com.example.java8Features.functionalInterface.lamda;




public class Main {

    public static void main(String[] args) {

        // Static method of Functional inteface directly called using 
        Fuctional.sayGoodBye();

         
         /*"How to use abstract methods of a functional interface using a lambda expression. We can say an interface reference can hold the lambda expression. 
         For using a lambda expression, you don't need a separate class to implement that interface." */

         Fuctional test = (str) -> System.out.println( str +"! welcome to my fuctional interface example");
         test.gretting("Ambar Gupta");


        // for default method.


           test.sayhello();

        
    }

}
