package com.example.bank;


import java.util.Random;

public class RandomMobileNumberGenerator {

      public static String getMobileNumber()
      {
          // Define a Random object
          Random random = new Random();

          // Generate the first digit (mobile numbers typically start with 7, 8, or 9)
          int firstDigit = 7 + random.nextInt(3); // 7, 8, or 9

          // Generate the remaining 9 digits
          StringBuilder mobileNumber = new StringBuilder(String.valueOf(firstDigit));
          for (int i = 0; i < 9; i++) {
              mobileNumber.append(random.nextInt(10)); // Append a digit between 0-9
          }
          return mobileNumber.toString();
      }

    public static void main(String[] args) {
        for(int i = 0 ; i<9 ;i++)
        System.out.println("Random Mobile Number: " + RandomMobileNumberGenerator.getMobileNumber());
    }
    }

