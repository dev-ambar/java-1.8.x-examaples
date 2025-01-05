package com.example.java8Features.functionalInterface.lamda;
  
/* fuctinal  Interface is  Interface have one and only one abstace method dectration  but any number 
 *  of default and static methods   in given  example we have  we have one abstract method  and  one 
 * static methd and one defult method .
 * @  use functional anotation  is optional it just to revent any accidentnal add new abstract method in 
 * you  interface
 */

 @FunctionalInterface
public interface Fuctional {


    public void  gretting (String str);

    default void sayhello()
    {
        System.out.println("hello welcome");
    }

    static void sayGoodBye()
    {
        System.out.println("GoodBye");
    }

}
