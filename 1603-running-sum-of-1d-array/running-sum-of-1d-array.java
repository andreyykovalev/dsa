class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] output = new int[nums.length];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++) {
            
            output[i] = currentSum + nums[i];
            currentSum += nums[i];
        }

        return output;
    }
}