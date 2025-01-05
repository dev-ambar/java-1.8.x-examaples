package com.example.bank;

import java.util.*;

/**
 * How to find pairs in an array whose sum is equal to the given number?
 *
 * Example - if the given array is (2,6,3,9,11) and the given number is 9,
 * output would be (6,3)
 */
public class Interview {

    public static void main(String[] args) {

       /* List<Integer> inputArray = Arrays.asList(0,2,6,3,9,11,7);
        int expect  = 9;
        Set<Integer> un = new HashSet<>();
        for(int i = 0 ; i < inputArray.size();i++ )
        {
            int temp = expect-inputArray.get(i);
            if(inputArray.contains(temp)) {
                  if(un.add(inputArray.get(i)) && un.add(temp))
                  System.out.println(inputArray.get(i) + "," + temp);
            }
        }*/

        List<Integer> numberArray = Arrays.asList(0,2,6,3,9,11,18);

        int input = 9;

        List<Integer> outPutArray = new ArrayList<>();

        for(int i = 0; i < numberArray.size(); i++ ){

            int diff = input - numberArray.get(i);
            if( Math.abs(diff) >= 0  ) {
                if(numberArray.contains(diff) && diff != input){
                    outPutArray.add(diff);
                }
            }
        }
        System.out.println(outPutArray);
    }
}
