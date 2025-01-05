package com.example.java8Features.functionalInterface.lamda;

public class EmployeeData {

    public static void main(String[] args) {

        Employee softwareEngineer =  () ->  "Ambar Gupta";

         System.out.println(softwareEngineer.getName());


         Employee teachLead =  () ->  "Ankur Gupta";

         System.out.println(teachLead.getName()); 
        
    }

}
