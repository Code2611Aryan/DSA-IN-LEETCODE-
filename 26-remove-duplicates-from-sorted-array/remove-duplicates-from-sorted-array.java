class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,ctr=1;
        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
                ctr++;
                i++;
                nums[i] = nums[j];
            }
        }
        return ctr;
         
    }
}