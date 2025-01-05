package com.example.java8Features.functionalInterface.comparator;

import java.util.*;

import com.example.bank.Employee;
import com.example.bank.EmployeeListGenerator;

public class MyClass {

    public static void main(String[] args) {

/*     
    List<Integer> number = List.of(8,7,88,95,15,45);

          System.out.println("list before shorting ");
          number.stream().forEach(System.out::println);
          System.out.println("list after sorting with netural order accending ");
          number.stream().sorted().forEach(System.out::println);

          System.out.println("list after sorting with decending  order using comparator");

          Comparator<? super Integer> comparator = (e1,e2) -> e2-e1;
          number.stream().sorted(comparator).forEach(System.out::println); */


          /*   TreeSet sorts with netural order accending by default when element add itself 
          
          Set<Integer> numberSet =  new TreeSet<>();
            numberSet.add(100);
            numberSet.add(89);
            numberSet.add(86);
            numberSet.add(895);
            numberSet.add(100);
            numberSet.add(18);
            numberSet.add(78);
            numberSet.add(485);
            System.out.println("TreeSet  before shorting ");
            numberSet.stream().forEach(System.out::println);
            System.out.println("Sort treeSet in reverse order");

            numberSet.stream().sorted((e1,e2) -> e2-e1).forEach(System.out::println); */

    /* implement Comparator in custom object collection  */

       List<Employee> empList = EmployeeListGenerator.getGenerateEmployeeList(5);

        System.out.println("Print Employee List");

        empList.stream().forEach(System.out::println); 

        System.out.println("sort employee data base on age using comparator");

        //empList.stream().sorted((emp1,emp2) -> emp1.getAge()-emp2.getAge()).forEach(System.out::println);

        // another way

        empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);







            


          

        
    }

}
