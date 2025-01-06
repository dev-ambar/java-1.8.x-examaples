package com.example.java8Features.functionalInterface.biFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MyClass {

    public static void main(String[] args) {

        BiPredicate<Integer,String> biPredicate = (x,str) -> str.length() == x ;

        System.out.println(biPredicate.test(5, "Ambar"));

        BiFunction<String,String,Integer> biFunction = (str1,str2) ->   str1.length()+str2.length();

        System.out.println("length of both strings: "+ biFunction.apply("Ambar", "Gupta"));

        BiConsumer<String,String> biConsumer = (str1,str2) ->  System.out.println("name is " + str1.concat(str2));
        biConsumer.accept("Ambar", "Gupta");
        
    }

}
