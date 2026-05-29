class Solution {
    public int removeDuplicates(int[] nums) {
         int ctr=1,i=0,j=1;
        while(j<nums.length){
            if(nums[j-1] !=nums[j]){
                ctr++;
                i++;
                nums[i] = nums[j];
                j++;
            }
            else{
                j++;
            }
        }
        for(int a=0;a<nums.length;a++){
            System.out.print(nums[a]+" ");
        }
        return ctr;

        
    }
}