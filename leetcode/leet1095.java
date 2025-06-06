package leetcode;

// Find in Mountain Array

public class leet1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 10, 8, 6, 3, 1};
        int target = 8;
        System.out.println(findInMountainArray(target, arr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        int maxNumIndex = MaxNumIndex(mountainArr, start, end);
        if(target == mountainArr[maxNumIndex]){
            return maxNumIndex;
        }
        int result = binarySearch(mountainArr, target, start, maxNumIndex);
        // System.out.println(result);
        if (result == -1) {
            result = binarySearch(mountainArr, target, maxNumIndex + 1, end);
        }
        // System.out.println(result);
        // System.out.println(maxNumIndex);
        return result;
    }

    static int MaxNumIndex(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
