class Solution {

    public int search(int[] nums, int target) {
        

        int left = 0;
        int right = nums.length - 1;
        

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(target == nums[mid]) {
                return mid;
            }
            //5 < 10 -> 
            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}





















    // public int search(int[] nums, int target) {
    //     return search(nums, target, 0, nums.length - 1);
    // }

    // private int search(int[] nums, int target, int left, int right) {
    //     int mid = (left + right) / 2;

    //     if(target == nums[mid]) {
    //         return mid;
    //     }
    //     if(left >= right) {
    //         return -1;
    //     }
    //     //targ = 10
    //     //1,2,4,10,345
    //     if(target > nums[mid]) {
    //         return search(nums, target, mid + 1, right);
    //     } else {
    //         return search(nums, target, left, mid - 1);
    //     }
    // }

    // public int search(int[] nums, int target) {
    //     int left = 0;
    //     int right = nums.length - 1;

    //     while(left <= right) {

    //         int mid = (left + right) / 2;

    //         if(target == nums[mid]) {
    //             return mid;
    //         }

    //         if(target > nums[mid]) {
    //             left = mid + 1;
    //         } else {
    //             right = mid -1;
    //         }
    //     }

    //     return -1;
    // }
// }