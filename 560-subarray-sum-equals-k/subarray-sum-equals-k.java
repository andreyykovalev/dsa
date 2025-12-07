class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumWithCount = new HashMap<>();

        prefixSumWithCount.put(0, 1);
        int prefixSum = 0;
        int result = 0;

        for(int num: nums) {
            prefixSum += num;

            if(prefixSumWithCount.containsKey(prefixSum - k)) {
                result += prefixSumWithCount.get(prefixSum - k);
            }

            prefixSumWithCount.put(prefixSum, prefixSumWithCount.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}