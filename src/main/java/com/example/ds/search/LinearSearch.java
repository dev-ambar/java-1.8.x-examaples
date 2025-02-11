package src.main.java.com.example.ds.search;

public class LinearSearch {

    // time complexity  is O(n)
    public static void main(String[] args) {

        //int[] numbs = {5,8,9,11,18,21};
        int[] numbs = new int[1000];
        int target = 11;

        int result  = linearSearch(numbs,target);

        if(result == -1 )
            System.out.println("number is not found");
        else
            System.out.println("number is found at index " +result);

    }

    public static int linearSearch(int[] numbs, int target) {
        int step = 0;
        for (int i = 0 ; i < numbs.length ; i++)
        {
            step ++;
            if(numbs[i] == target) {
                System.out.println("total steps has taken  to search elements is :"+step);
                return i;
            }
        }
        System.out.println("total steps has taken  to search elements is :"+step);
        return -1;
    }
}
