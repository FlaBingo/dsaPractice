package binarySearch;

// Find position of an element in a sorted array of infinite numbers
public class infiniteArray {
    public static void main(String[] args) {
        // start with the box of size 2
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30, 34, 36, 93, 244, 243, 254, 256, 257, 267, 287, 290,
                291, 292, 294, 295, 296, 297, 300 };
        int target = 294;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            // int temp = end + 1;
            // end = end + (end - start + 1) * 2;
            // start = temp;
            start = end + 1;
            end = start * 2 + 1;
        }
        return binarySearch(arr, target, start, end);
        // int ans = -1;
        // while (ans == -1) {
        // ans = binarySearch(arr, target, start, end);
        // start = end + 1;
        // end = start * 2 + 1;
        // }
        // return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
