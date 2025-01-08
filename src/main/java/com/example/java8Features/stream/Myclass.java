package com.example.java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Myclass {

     // Stream is the sequenceial representaion of  of  elements  of collection where we can perfome operation using functional & declarative ways.

    public static void main(String[] args) {

        Stream<String> strStream = List.of("Ambar","Ankit","Vipul","Rohit","Sony").stream();
        strStream.forEach(x -> System.out.println(x));
         
         Integer [] intArray = {1,2,4,5,7};

        Stream<Integer> intArrayStream =  Arrays.stream(intArray);

        //intArrayStream.forEach(x -> System.out.println(x));

        intArrayStream.map(x-> x*2).forEach(x-> System.out.println(x));

        Stream<Integer> intStrem = Stream.of(1,2,3,4,3,5,5,7,1,4);

        System.out.println(intStrem.distinct().count());

        Stream<String> helloStream = Stream.generate(()->"JAI Shri RAM").limit(15);
        helloStream.forEach(System.out::println);

        String [] alpCharacters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        Stream<Integer> randomNumber = Stream.generate(()-> new Random().nextInt(0,100)).limit(5);
        randomNumber.forEach(System.out::println);

        Stream<String> randomNameOf5 = Stream.generate(() -> { return 
            (alpCharacters[new Random().nextInt(1,26)]+
            alpCharacters[new Random().nextInt(1,26)] +
            alpCharacters[new Random().nextInt(1,26)]+
            alpCharacters[new Random().nextInt(1,26)]+
            alpCharacters[new Random().nextInt(1,26)]);
        }
             
        ).limit(5);
        randomNameOf5.forEach(System.out::println);



        int c = Stream.iterate(1, (x) -> x+1).limit(987).filter(y -> y%3 == 0).max((a,b) -> a-b).get();
        System.out.println(c);
           
        

 


        
    }

}
