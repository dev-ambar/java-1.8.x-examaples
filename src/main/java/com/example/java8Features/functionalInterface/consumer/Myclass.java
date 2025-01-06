package com.example.java8Features.functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;

// Consumer is the fuctional inteface which take the insuput but doest not return any thing  only process  or action on it

public class Myclass {

    public static void main(String[] args) {

        /* Consumer<Integer> consumer = (x) -> System.out.println("x = "+x);
        consumer.accept(100); */

        Consumer<List<Integer>> listWithIncrementAndprintConsumer =  list -> {

            for(int x : list)
            {
                System.out.println("x = :" + (x+100));
            }
        };

        //listWithIncrementAndprintConsumer.accept(List.of(1,2,3,4,5));

        Consumer<List<Integer>> listPrintConsumer =  list -> {

            for(int x : list)
            {
                System.out.println("x = :" + (x));
            }
        };

        listPrintConsumer.andThen(listWithIncrementAndprintConsumer).accept(List.of(1,2,3,4,5));
        
    }

}
