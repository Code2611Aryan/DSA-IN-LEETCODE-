class Solution {
   public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = -1;

        // Find first zero
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }

        // No zero present
        if (i == -1) {
            return;
        }

        // Move non-zero elements forward
        for (int j = i + 1; j < n; j++) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }
    }
}