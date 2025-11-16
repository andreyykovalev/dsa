class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int sum = 0;

    // first window sum
    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }

    double maxAverage = (double) sum / k;

    // slide the window
    for (int i = k; i < nums.length; i++) {
        sum += nums[i] - nums[i - k];      // add new, remove old
        maxAverage = Math.max(maxAverage, (double) sum / k);
    }

    return maxAverage;
}
}