class Solution {
    public int firstUniqChar(String s) {
        char[] sArray = s.toCharArray();
        Set<Character> nonUniqueItems = new HashSet<>();

        for(int i = 0; i < sArray.length; i++) {
                char c = sArray[i];
                boolean isUnique = true;
            for(int j = i + 1; j < sArray.length; j++) {
                char k = sArray[j];
                if(c == k) {
                    isUnique = false;
                    nonUniqueItems.add(c);
                    break;
                }
            }
            if(isUnique && !nonUniqueItems.contains(c)) {
                return i;
            }
        }
        return -1;
    }
}