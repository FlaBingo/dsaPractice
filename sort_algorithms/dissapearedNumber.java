package sort_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.


// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:
// Input: nums = [1,1]
// Output: [2]

public class dissapearedNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.err.println((findDisappearedNumbers(nums)));
    }

    static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans.add(j + 1);
            }
        }
        return ans;
    };

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    };
}
