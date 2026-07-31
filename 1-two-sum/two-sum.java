class Solution {
    static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] arr = {-1,-1};
        for(int i=0;i<n;i++){
            int missnum = target - nums[i];
            if(!map.containsKey(missnum)){
                map.put(nums[i], i);
            }
            else{
                arr[0] = i;
                arr[1] = map.get(missnum);
                return arr;
            }

        }
        return  new int[]{-1, -1};

    }
    
}