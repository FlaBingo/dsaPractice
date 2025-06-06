package leetcode;

// Peak Index in a mountain Array [0, 2, 4, 2, 1, 0]
public class leet852 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
        System.out.println(MaxNumIndex(arr));
    }

    static int MaxNumIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        // while (start <= end) {
        //     int mid = start + (end - start) / 2;

        //     if(arr[mid] > arr[mid + 1]){
        //         end = mid - 1;
        //     }else if(arr[mid] < arr[mid + 1]){
        //         start = mid + 1;
        //     }
        // }
        
        // bhai ka solution
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
