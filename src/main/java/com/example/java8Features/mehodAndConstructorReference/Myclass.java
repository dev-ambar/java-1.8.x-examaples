package com.example.java8Features.mehodAndConstructorReference;

import java.util.List;
 /* In Java, method references and constructor references are a shorthand notation of lambda expressions. Introduced in Java 8
  * 1. Method References
            A method reference points to a method by its name. It allows us to use a method as an argument to a functional interface.

            Syntax

            ClassName::methodName
  */
public class Myclass {

    // example 1: Reference to a Static Method
    public static void printName(String x) {
        System.out.println(x);
    }

    // example 2: Reference to a Instance Method
    public void printNameInUpper(String x) {
        System.out.println(x.toUpperCase());
    }

    public static void main(String[] args) {

        /*
         * List<String> names = List.of("ShriRam","ShriKrishna","ShriHnuman");
         * 
         * // using normal Lamda expression
         * 
         * names.stream().forEach(x -> Myclass.printName(x));
         * 
         * // using Method reference to refer static method by directly Class NAme
         * 
         * names.stream().forEach(Myclass::printName);
         */

        List<String> names = List.of("ShriRam", "ShriKrishna", "ShriHnuman");

        Myclass myclass = new Myclass();

        // using normal Lamda expression

        names.stream().forEach(x -> myclass.printNameInUpper(x));

        // using Method reference to refere instance method create instance of MyClass

        names.stream().forEach(myclass::printNameInUpper);

    }

}
