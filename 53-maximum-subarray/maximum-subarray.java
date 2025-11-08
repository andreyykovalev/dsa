class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;


//      [-2,1,-3,4,-1,2,1,-5,4]
//        i
        for(int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }

        }
        return maxSum;
    }
}