class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int l = 0, r = 0;
    int sum = 0;
    double maxAverage = Double.NEGATIVE_INFINITY;

    while (r < nums.length) {
        sum += nums[r];

        // window reached size k
        if (r - l + 1 == k) {
            maxAverage = Math.max(maxAverage, (double) sum / k);
            sum -= nums[l];
            l++;
        }

        r++;
    }

    return maxAverage;
}
}