class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tolSum = (n*(n+1))/2;
        int arrsum =0;
        for(int i=0;i<n;i++){
            arrsum = arrsum+nums[i];
        }
        return tolSum - arrsum;
        
    }
}