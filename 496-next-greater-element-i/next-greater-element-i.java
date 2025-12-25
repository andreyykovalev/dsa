class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length];
        int k = 0;
        //iter over nums1
        for(int i = 0; i < nums1.length; i++) {

            int num1 = nums1[i];
            boolean isFound = false;

            int start = 0;

            for(int s = 0; s < nums2.length; s++) {
                if(nums2[s] == num1) {
                    start = s;
                    break;
                }
            }

            //iter over nums2 for each nums1
            for(int j = start + 1; j < nums2.length; j++) {

                int num2 = nums2[j];

                if(num2 > num1) {
                    result[k] = num2;
                    k++;
                    isFound = true;
                    break;
                }
            }
            if(!isFound) {
                result[k] = -1;
                k++;
            }
        }
        return result;
    }
}