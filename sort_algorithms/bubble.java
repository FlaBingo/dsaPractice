package sort_algorithms;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {23, 4, 43, 2, 3, 5};
        // bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int [] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if(!swapped){
                break;
            }
        }
    };

}
