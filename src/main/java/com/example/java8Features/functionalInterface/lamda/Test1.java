package com.example.java8Features.functionalInterface.lamda;

public class Test1{
     public static void main(String[] args) {
        
         // first use of fuctional interface 

         Opration addTwoNumber  = (a,b) ->  a+b ;
         System.out.println(addTwoNumber.result(5,7));
 
               // second use of fuctional interface 
 
         Opration multipleTwoNumber  = (a,b) ->  a*b ;
         System.out.println(multipleTwoNumber.result(5,7));
     }

}
