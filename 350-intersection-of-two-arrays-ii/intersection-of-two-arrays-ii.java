class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
        //[4,5,9]
//             L
        //[4,4,7,8,9]
//                 R
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int l = 0;
        int r = 0;
        while (l < nums2.length && r < nums1.length) {
            if(nums2[l] == nums1[r]) {
                result.add(nums2[l]);
                l++;
                r++;
            } else if (nums2[l] < nums1[r]) {
                l++;
            } else {
                r++;
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}