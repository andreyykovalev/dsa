class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
    //[-1,0,1,2,-1,-4]
    //[[-1,-1,2],[-1,0,1]]
    Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            Map<Integer, Integer> map = new HashMap<>();
            int target = -nums[i];

            for(int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];

                if(map.containsKey(complement)) {
                    result.add(Arrays.asList(nums[i], nums[j], complement));
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
                }
                map.put(nums[j], j);
            }
        }

        return result;
    }
}