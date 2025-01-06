package com.example.java8Features.functionalInterface.suplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// suplier  is  functional interface which nothing take asinout but rerturn generic type 

public class Myclass {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () ->  100;
        Predicate<Integer> isEven = (x) -> x%2 == 0;
        Function<Integer,Integer> square = (x) -> x*x;
        Consumer<Integer> printNumber = (x) -> System.out.println("Square of number " + x);

           //System.out.println(supplier.get());
           if(isEven.test(supplier.get()))
             printNumber.accept(square.apply(supplier.get()));
        
    }

    

     

}
