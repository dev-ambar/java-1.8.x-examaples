package com.example.java8Features.mehodAndConstructorReference;

import java.util.List;
import java.util.stream.Collectors;

public class StudentImp {

    public static void main(String[] args) {

        List<String> names = List.of("ShriRam", "ShriKrishna", "ShriHnuman");
         

        // Example without Constructor reference 
       
       /*  List<Student> students = names.stream()
                                  .map(x ->  new Student(x))
                                    .collect(Collectors.toList());
        students.forEach( x -> System.out.println(x)); */

        // Example with Constructor reference 


        List<Student> students = names.stream()
                                  .map(Student::new)
                                    .collect(Collectors.toList());

        students.stream().forEach(System.out::println);
        
    }

}
