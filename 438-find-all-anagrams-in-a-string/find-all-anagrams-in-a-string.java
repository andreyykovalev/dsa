class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();

        Map<Character, Integer> need = new HashMap<>();

        for(char c: p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int windowSize = p.length();
        int left = 0;
        int right = 0;
        while(right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            //shink window if big
            if(right - left + 1 > windowSize) {
                char remove = s.charAt(left);
                window.put(remove, window.get(remove) - 1);
                if(window.get(remove) == 0) {
                    window.remove(remove);
                }
                left++;
            }
            
            if(need.equals(window)) {
                out.add(left);
            }
            right++;
        }

        return out;
    }
}