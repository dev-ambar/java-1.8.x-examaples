package com.example.java8Features.functionalInterface.predicates;

import java.util.List;
import java.util.function.Predicate;

import com.example.bank.EmployeeListGenerator;
import com.example.bank.Employee;


public class MyClass { 

     public static void main(String[] args) {


        List<Employee> empList = EmployeeListGenerator.getGenerateEmployeeList(5);

        System.out.println("print the all employee data");

        empList.stream().forEach(System.out::println);

        System.out.println("print the Employee Age  greater than 18 ");

        empList.stream().filter(e -> (e.getAge() > 18)).forEach(System.out::println);

        System.out.println("print the Employee  name Start with A and Last name Start with J");

         Predicate<Employee> firstNameStartWithA =  e -> e.getFirstName().toLowerCase().charAt(0) == 'a';
         Predicate<Employee> LastNameStartWithJ =  e -> e.getLastName().toLowerCase().charAt(0) == 'j';

        Predicate<Employee> bothCondition  = firstNameStartWithA.and(LastNameStartWithJ);

         empList.stream().filter(bothCondition).forEach(System.out::print);

         System.out.println("print the Employee  name Start with A Or Last name Start with J");

         Predicate<Employee> orCondition  = firstNameStartWithA.or(LastNameStartWithJ);

         empList.stream().filter(orCondition).forEach(System.out::print);

        

                   




        
     }

}
