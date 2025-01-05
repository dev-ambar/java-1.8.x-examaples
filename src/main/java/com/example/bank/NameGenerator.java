package com.example.bank;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameGenerator {

    private static final List<String> firstNames = Arrays.asList("John", "Jane", "Michael", "Emily", "Christopher", "Olivia", "William", "Ava", "David", "Sophia", "James", "Isabella", "Robert", "Mia", "George", "Charlotte", "Thomas", "Amelia", "Daniel", "Evelyn");
    private static final List<String> lastNames = Arrays.asList("Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Moore", "Jackson", "White", "Lee", "Harris", "Clark");

    public static String  getFirstName()
    {
        Random random= new Random();
        return firstNames.get(random.nextInt(firstNames.size()));
    }

    public static String  getLastName()
    {
        Random random= new Random();
        return lastNames.get(random.nextInt(lastNames.size()));
    }

    public static void main(String[] args) {
        for (int i = 0 ; i <10 ; i++)
        System.out.println(getFirstName()+" "+getLastName());
    }

}
