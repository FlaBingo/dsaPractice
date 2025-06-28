package sort_algorithms;

public class duplicateNumber {
    public void main(String[] args) {
        // int[] nums = {3, 3, 3, 3, 3};
        // int[] nums = {3, 1, 3, 4, 2};
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(i != correct){
                if(nums[i] == nums[correct]){
                    break;
                }
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        return nums[i];
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
