class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;

        for(int k = nums.length - 1; k >= 0; k--) {
            int iSquared = nums[i] * nums[i];
            int jSquared = nums[j] * nums[j];

            if(iSquared > jSquared) {
                result[k] = iSquared;
                i++;
            } else {
                result[k] = jSquared;
                j--;
            }
        }
        return result;
    }
}