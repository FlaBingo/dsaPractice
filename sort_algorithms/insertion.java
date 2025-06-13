package sort_algorithms;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    };

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // System.out.println(i + "(i) is " + j + " less than " + (j-1));
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    // System.out.println("no");
                    break;
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    };
}
