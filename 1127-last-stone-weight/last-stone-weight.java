class Solution {
    public int lastStoneWeight(int[] stones) {
        //[2,7,4,1,8,1]

        //max heap (binary tree) :
        //1.heap.poll() -> biggest elem "a"
        //2.heap.poll() -> 2d biggest "b"
        //3. compare a and b
        //4a. if(a == b) continue (both are destroyed)
        //4b. a = a - b -> heap.offer(a);

        //while(heap.isEmpty or heap size == 1)

        //O(N * log n);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);


        for(int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        while (maxHeap.size() > 1) {
            Integer a = maxHeap.poll();
            Integer b = maxHeap.poll();

            if(Objects.equals(a, b)) continue;

            int heavy = Math.max(a, b);
            int light = Math.min(a, b);

            int newStone = heavy - light;

            maxHeap.offer(newStone);
        }

        return maxHeap.isEmpty() ? 0: maxHeap.poll();
    }
}