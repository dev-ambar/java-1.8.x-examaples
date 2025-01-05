package com.example.bank;

import java.util.Comparator;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        List<Employee> oneMillionEmployees = EmployeeListGenerator.getGenerateEmployeeList(1000000);
         System.out.println("total number of  of Employees : "+ oneMillionEmployees.size());
         long startTime = System.currentTimeMillis();
         //printMaxSalaryEmp(oneMillionEmployees);
        // printMinSalaryEmp(oneMillionEmployees)
          //printEmpCountSalaryHigherThan50000(oneMillionEmployees);
          //printEmpCountSalaryGreaterThan50000(oneMillionEmployees);
         printEmpCountSalaryEqual50000(oneMillionEmployees);
         long endTime = System.currentTimeMillis();
         System.out.println("total time to calculate: " + (endTime-startTime)+ " ms");

    }

    private static void printEmpCountSalaryEqual50000(List<Employee> oneMillionEmployees) {

        int count = (int) oneMillionEmployees.parallelStream().filter(employee -> employee.getSalary() == 50000).count();
        System.out.println("total emp with salary more than 50000 are "+ count);
    }

    @SuppressWarnings("unused")
    private static void printEmpCountSalaryGreaterThan50000(List<Employee> oneMillionEmployees) {

          oneMillionEmployees.parallelStream().filter(employee -> employee.getSalary() > 50000).forEach(System.out::println);
    }

    @SuppressWarnings("unused")
    private static void printEmpCountSalaryHigherThan50000(List<Employee> oneMillionEmployees) {
         int count = (int) oneMillionEmployees.parallelStream().filter(employee -> employee.getSalary() > 50000).count();
        System.out.println("total emp with salary more than 50000 are "+ count);

    }

    @SuppressWarnings("unused")
    private static void printMaxSalaryEmp(List<Employee> oneMillionEmployees) {
        Employee maxSalaryEmp = oneMillionEmployees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
        System.out.println("employee with max salary"+ maxSalaryEmp.toString());
    }

    @SuppressWarnings("unused")
    private static void printMinSalaryEmp(List<Employee> oneMillionEmployees) {
        Employee minSalaryEmp = oneMillionEmployees.stream().min(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
        System.out.println("employee with min salary"+ minSalaryEmp.toString());
    }
}
