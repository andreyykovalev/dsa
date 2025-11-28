class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int palindromeLength = 0;
        boolean hasOdd = false;
        for(Integer count: map.values()) {
            if(count % 2 == 0) {
                palindromeLength += count;
            } else {
                hasOdd = true;
                palindromeLength = palindromeLength + (count - 1);
            }
        }

        if(hasOdd) {
            palindromeLength += 1;
        }

        return palindromeLength;
    }
}