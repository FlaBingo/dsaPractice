package gfg;

//Find the Rotation Count in Rotated Sorted array
public class RotationCount {
    public static void main(String[] args) {
        // int[] arr = {15, 18, 19};
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findRotationCount(arr));
    }

    static int findRotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int peak = findPeak(arr, start, end);
        if(peak == end) return 0;
        return (peak + 1);
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
}
