package src.main.java.com.example.ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] nums = {6,5,2,8,9,4};
        int temp = 0;
        System.out.println("number before sorting : ");
        for(int x : nums)
            System.out.print(x+" ");
        int size = nums.length;
        for(int i = 0; i < size ; i++)
        {
            for( int j = 0 ; j<size-i-1 ; j++)
            {
                 if(nums[j] > nums[j+1])
                 {
                     temp = nums[j];
                     nums[j] = nums[j+1];
                     nums[j+1] = temp;
                 }

            }
            System.out.println("");
            for(int x : nums)
                System.out.print(x+" ");

        }
        System.out.println("");
        System.out.println("number After sorting : ");
        for(int x : nums)
            System.out.print(x+" ");
    }

}
