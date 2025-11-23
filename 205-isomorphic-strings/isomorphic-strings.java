class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Input: s = "egg", t = "add"
        // egg -> add
        // e -> a
        // g -> d

        Set<Character> sSet = new HashSet<>();
        Set<Character> tSet = new HashSet<>();
        Set<String> pairSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            sSet.add(s.charAt(i));
            tSet.add(t.charAt(i));
            pairSet.add(new String(s.charAt(i) + ":" + t.charAt(i)));
        }

        return sSet.size() == tSet.size() && sSet.size() == pairSet.size();
    }
}