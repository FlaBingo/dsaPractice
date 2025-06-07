package leetcode;

// Search in Rotated Sorted Array
public class leet33 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 4;
        System.out.println("target index " + findInMountainArray(nums, target));
    }

    static int findInMountainArray(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int peak = findPeak(nums, start, end);
        System.out.println("Peak index " + peak);

        if (target < nums[0]) {
            return binarySearch(nums, target, peak + 1, end);
        }else{
            return binarySearch(nums, target, start, peak - 1);
        }
    }

    static int findPeak(int[] nums, int start, int end){
        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[mid + 1]){
                return mid;
            }

            if(nums[0] > nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
