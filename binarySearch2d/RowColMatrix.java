package binarySearch2d;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50},
            {36, 39, 41, 60},
        };
        int target = 52;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length - 1;

        while(r < matrix.length && c >= 0){
            if(target == matrix[r][c]) return new int[]{r, c};

            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
