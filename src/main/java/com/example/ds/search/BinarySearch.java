package src.main.java.com.example.ds.search;

public class BinarySearch {
     // time complexity  is O(n)
    public static void main(String[] args) {

        //int[] numbs = {5,8,9,11,18,21};
        int[] numbs = new int[1000];
        int target = 11;

        int result  = binarySearch(numbs,target);

        if(result == -1 )
            System.out.println("number is not found");
        else
            System.out.println("number is found at index " +result);

    }

    public static int binarySearch(int[] numbs, int target) {
            int step = 0;
            int left = 0;
            int right =  numbs.length -1;
             while(left <= right)
             {
                    step ++;
                 int mid = (left+right)/2;
                    if(numbs[mid] == target ) {
                        System.out.println("total steps has taken  to search elements is :"+step);
                        return mid;
                    }
                    else if(numbs[mid] < target) {
                        left = mid + 1;
                    }
                     else {
                        right = mid - 1;
                    }
             }
        System.out.println("total steps has taken  to search elements is :"+step);
        return -1;
    }
}
