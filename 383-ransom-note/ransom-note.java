class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] alphabetArray = new int[26];

        for(char c: magazine.toCharArray()) {
            alphabetArray[c - 'a']++;
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if(alphabetArray[c - 'a'] == 0) {
                return false;
            } else {
                alphabetArray[c - 'a']--;
            }
        }
        return true;
    }
}