package com.example.java8Features.functionalInterface.function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.bank.Employee;
import com.example.bank.EmployeeListGenerator;

public class MyClass {
    public static void main(String[] args) {

        /* Function<Integer, Integer> fuctorial = (x) -> {

             for(int i = x-1 ; i>=1 ; i-- )
             {
                  x =  x * (i);
             }
             return x;
        };
        System.out.println(fuctorial.apply(5));
    } */

     /* Function<String,Integer> strLength = str ->  str.length();
      System.out.println(strLength.apply("Ambar")); */

       /*Function<String,String> toUpperCase = str -> str.toUpperCase();
      Function<String,String> getFirst4Char = str -> str.substring(0, 3);

      System.out.println(toUpperCase.andThen(getFirst4Char).apply("Vipul")); */

      Function<List <Employee>,List<Employee>> firstNameGreaterThan5 = (empList) -> {

         return empList.stream().filter( e -> (e.getFirstName().length() >= 5)).collect(Collectors.toList());
      };

       List<Employee> emp = firstNameGreaterThan5.apply(EmployeeListGenerator.getGenerateEmployeeList(5));
       emp.stream().forEach(System.out::println);




    }

}




