class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //"eat", "tae", "tea", "art" -> ["eat", "tae", "tea"], ["art"]

        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);

            if(!map.containsKey(new String(sortedStr))) {
                List<String> anagramGroup = new ArrayList<>();
                anagramGroup.add(str);
                map.put(new String(sortedStr), anagramGroup);
            } else {
                map.get(new String(sortedStr)).add(str);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}