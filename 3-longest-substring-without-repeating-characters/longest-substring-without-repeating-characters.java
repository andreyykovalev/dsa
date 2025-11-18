class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max = 0;

       Set<Character> set = new HashSet<>();
       char[] sArray = s.toCharArray();

       for(int left = 0, right = 0; right < sArray.length;) {
            if(!set.contains(sArray[right])) {
                set.add(sArray[right]);
                max = Math.max(max, set.size());
                right++;
            } else {
                set.remove(sArray[left]);
                left++;
            }
       }
       return max;
    }














    //"abcabcbb"
//     public int lengthOfLongestSubstring(String s) {
//        int max = 0;

//        char[] sArr = s.toCharArray();
//        Set<Character> set = new HashSet<>();

//        for(int left = 0, right = 0; right < sArr.length;) {

//             if(!set.contains(sArr[right])) {
//                 set.add(sArr[right]);
//                 right++;
//                 max = Math.max(max, set.size());
//             } else {
//                 set.remove(sArr[left]);
//                 left++;
//             }

//        }
//        return max;
// }
}