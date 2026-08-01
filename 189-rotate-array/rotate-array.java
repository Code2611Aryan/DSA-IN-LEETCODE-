class Solution {
        public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n - 1);  // 1. Whole array
        reverse(nums, 0, k - 1);   // 2. First k
        reverse(nums, k, n - 1);   // 3. Remaining
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}