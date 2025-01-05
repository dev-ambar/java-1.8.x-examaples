package com.example.bank;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) {

            List<Employee> employees = EmployeeListGenerator.getGenerateEmployeeList(5);

            Comparator<? super Employee> compSalary = Comparator.comparingDouble(Employee::getSalary);

            Comparator<? super Employee> compAge = Comparator.comparingInt(Employee::getAge);

            Map<Employee, Double> sortedWithSalaryMap = employees.stream().sorted(compSalary).
                    collect(Collectors.toMap( e -> e, Employee::getSalary,(oldValue,newValue)-> oldValue,LinkedHashMap:: new));

            System.out.println("Print the sorted map with Salary ");

            sortedWithSalaryMap.forEach((employee, salary) -> System.out.println(employee + " -> " + salary));

            Map<Employee, Integer> sortedWithAgeMap = employees.stream().sorted(compAge).
                    collect(Collectors.toMap(e -> e,Employee::getAge,(oldValue,newValue)-> oldValue,LinkedHashMap:: new));
            // Print the sorted map
            System.out.println("Print the sorted map with Age  ");
            sortedWithAgeMap.forEach((employee, age) -> System.out.println(employee + " -> " + age));
        }

}
