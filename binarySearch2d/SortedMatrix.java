package binarySearch2d;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        int target = in.nextInt();
        // for (int[] is : matrix) {
        //     for (int is2 : is) {
        //         System.out.println(Arrays.toString(mySearch(matrix, is2)));
        //     }
        // }
        // System.out.println(Arrays.toString(search(matrix, target)));
        System.out.println(Arrays.toString(mySearch(matrix, target)));

    }

    static int[] mySearch(int[][] matrix, int target){
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        if(rows == 0){
            return binarySearch(matrix, 0, 0, cols, target);
        }
        int cMid = cols/2;
        int rStart = 0;
        int rEnd = rows;
        while (rStart <= rEnd) {                                            //int[][] matrix = {
            int mid = rStart + (rEnd - rStart) / 2;                         //    {1, 2, 3, 4},
            if(target == matrix[mid][cMid]) return new int[]{mid, cMid};    //    {5, 6, 7, 8},
            if(target < matrix[mid][cMid]){                                 //    {9, 10, 11, 12},
                rEnd = mid - 1;                                             //    {13, 14, 15, 16},
            }else{                                                          //};
                rStart = mid + 1;
            }
        }
        // System.out.println(rStart-1 + " " + rStart);
        if(rStart == 0 || (target > matrix[rStart - 1][cols] && rStart != rows + 1)){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        return binarySearch(matrix, rStart - 1, cMid + 1, cols, target);
    }



    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(target > matrix[row][mid]){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }






    //so this was bhai ka solution
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        //run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){            //int[][] matrix = {
                return new int[]{mid, cMid};            //    {1, 2, 3, 4},
            }                                           //    {5, 6, 7, 8},
            if(matrix[mid][cMid] < target){             //    {9, 10, 11, 12},
                rStart = mid;                           //    {13, 14, 15, 16},
            }else{                                      //};  target = 10
                rEnd = mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }



        // search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if(target >= matrix[rStart][cMid - 1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        // search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        // search in 4th half
        else{
            return binarySearch(matrix, rStart+1, 0, cols-1, target);
        }
    }
}
