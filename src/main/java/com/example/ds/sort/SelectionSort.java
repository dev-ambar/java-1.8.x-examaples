package src.main.java.com.example.ds.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {25,89,14,57,11};
        int size = arr.length;
        int temp = 0;
        int minIndex = -1 ;
        System.out.println("before sorting array");
        for (int x : arr)
            System.out.print(x+" ");
        System.out.println("");
        System.out.print("processing....");
        for(int i = 0 ; i < size ; i++) {
                  minIndex = i;
            for (int j = i; j < size -1; j++) {
                if (arr[minIndex] > arr[j + 1])
                    minIndex = j + 1;
            }
               temp = arr[i];
              arr[i] = arr[minIndex];
              arr[minIndex] = temp;
            System.out.println();
            for (int x : arr)
                System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("After sorting array");
        for (int x : arr)
            System.out.print(x+" ");


    }
}
