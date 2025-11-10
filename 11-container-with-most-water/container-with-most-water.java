class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int currentValue = 0;

        //[1,8,6,2,5,4,8,3,7]
        // 0,1         6,7,8
        //[1, 1]
        // i

        // for(int i = 0; i < height.length; i++) {
            
        //     for(int j = i; j < height.length; j++) {
        //         if(i < j) {
        //             int start = height[i];
        //             int end = height[j];
        //             int spaceBetween = j - i;
        //             maxArea = Math.max(maxArea, spaceBetween * Math.min(start, end));   
        //         }
        //     }
        // }
        int left = 0;
        int right = height.length - 1;
        
        while(left < right) {
            int start = height[left];
            int end = height[right];

            int spaceBetween = right - left;
            int currentArea = spaceBetween * Math.min(start, end);

            maxArea = Math.max(maxArea, currentArea);

            if(start < end) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}