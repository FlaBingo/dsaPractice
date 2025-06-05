import java.util.Arrays;

public class leetcode34 {
    //   34. Find First and Last Position of Element in Sorted Array
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 }; 
        int target = 10; //[1,4]
        System.err.println(Arrays.toString(findFirstAndLast(nums, target)));
    }
    static int[] findFirstAndLast(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0; 
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}