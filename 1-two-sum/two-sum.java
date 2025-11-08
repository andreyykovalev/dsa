class Solution {
        public int[] twoSum(int[] nums, int target) {
        
          //[1,2,3,4]
        //i  0
        //j    1
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                
                if(i == j) continue;

                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}