class Solution {
            public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        Map<Character, Integer> need = new HashMap<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int len = s1.length();

        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(i >= len) {
                char rm = s2.charAt(i - len);
                window.put(rm, window.get(rm) - 1);
                if (window.get(rm) == 0) window.remove(rm);
            }
            if (window.equals(need)) return true;
        }
        return false;
    }
}