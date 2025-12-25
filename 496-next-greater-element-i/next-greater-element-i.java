class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    int[] result = new int[nums1.length];

    for (int i = 0; i < nums1.length; i++) {
        int num1 = nums1[i];
        int start = -1;

        // find num1 index in nums2
        for (int s = 0; s < nums2.length; s++) {
            if (nums2[s] == num1) {
                start = s;
                break;
            }
        }

        // find next greater element
        int nextGreater = -1;
        for (int j = start + 1; j < nums2.length; j++) {
            if (nums2[j] > num1) {
                nextGreater = nums2[j];
                break;
            }
        }

        result[i] = nextGreater;
    }
    return result;
}
}