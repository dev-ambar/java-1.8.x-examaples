package com.example.java8Features.mehodAndConstructorReference;

public class Student {

     private String name ;


      @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Student (String name)
      {
        this.name = name ;
      }




}
