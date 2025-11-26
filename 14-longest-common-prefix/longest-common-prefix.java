class Solution {
        public String longestCommonPrefix(String[] strs) {
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"

        StringBuilder sb = new StringBuilder();

        String firstStr = strs[0];

        for(int i = 0; i < strs[0].length(); i++) {
            char c = firstStr.charAt(i);
            
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}