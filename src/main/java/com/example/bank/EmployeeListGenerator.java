package com.example.bank;

import java.time.LocalDate;
import java.util.*;
import java.util.Random;

public class EmployeeListGenerator {

     public static List<Employee> getGenerateEmployeeList(int size )
     {
          List<Employee> empList = new ArrayList<>();
          for(int i= 0 ; i < size ; i++ )
          {
               Employee emp = new Employee();
               emp.setId(i+1);
               String firstName = NameGenerator.getFirstName();
               emp.setFirstName(firstName);
               String lastName = NameGenerator.getLastName();
               emp.setLastName(lastName);
               emp.setDob(LocalDate.of(1980 + new Random().nextInt(20),
                       new Random().nextInt(12)+1,new Random().nextInt(28)+1));
               emp.setAge(LocalDate.now().getYear()-emp.getDob().getYear());
               emp.setSalary(500 + new Random().nextInt(Integer.MAX_VALUE));
               emp.setDepartment("Department" + new Random().nextInt(10));
               emp.setEmailId(firstName +"."+ lastName +"@example.com");
               emp.setMobileNo(RandomMobileNumberGenerator.getMobileNumber());
               emp.setCountry(CountryGenerator.getCountry());
               empList.add(emp);


          }
          return  empList;
     }
}
