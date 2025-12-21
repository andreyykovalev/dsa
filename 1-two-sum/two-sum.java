class Solution {
        public int[] twoSum(int[] nums, int target) {
        //k = 3
          //[1,2,3,4]
        //i  0
        //j    1
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            
            int curr = nums[i];
            int complement = target - curr;

            if(map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }

            map.put(curr, i);

        }

        return new int[]{};
    }
}