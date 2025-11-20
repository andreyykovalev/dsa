class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();

        Map<Character, Integer> need = new HashMap<>();

        for(char c: p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int len = p.length();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(i >= len) {
                char rm = s.charAt(i - len);
                window.put(rm, window.get(rm) - 1);
                if (window.get(rm) == 0) window.remove(rm);
            }

            if(need.equals(window)) {
                out.add(i - len + 1);
            }
        }

        return out;
    }
}