class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //[4,9,5]
        //[9,4,9,8,4]
//        L
//        R

        //map
        //4 -> 1
        //9 -> 1
        //5 -> 1

        //if map.get(4) >= 1 -> res.add(4)

        // out -> {4, 9}

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            int current = nums2[i];
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            if (map.containsKey(current) && map.get(current) > 0) {
                result.add(current);
                map.put(current, map.get(current) - 1);
            }
        }
        
        return  result.stream().mapToInt(i -> i).toArray();
    }
}