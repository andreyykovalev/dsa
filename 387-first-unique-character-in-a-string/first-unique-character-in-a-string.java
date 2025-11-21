class Solution {
    public int firstUniqChar(String s) {
        char[] sArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c: sArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < sArray.length; i++) {
            if(map.get(sArray[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}