class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for(char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if(!magazineMap.containsKey(c)) {
                return false;
            } else {
                magazineMap.put(c, magazineMap.get(c) - 1);
                if(magazineMap.get(c) == 0) {
                magazineMap.remove(c);
                }
            }
        }
        return true;
    }
}