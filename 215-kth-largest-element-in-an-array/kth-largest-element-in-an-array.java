class Solution {
    public int findKthLargest(int[] nums, int k) {
        // [3,2,1,5,6,4], k = 2
        // [6,5,4,3,2,1], kth(2d) largest - 5

        //max heap -> poll -> 1st largest, 2d largest etc
        //while k != 0 -> poll if polled is smaller -> k--;

        if(nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}