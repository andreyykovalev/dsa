class Solution {
    public boolean lemonadeChange(int[] bills) {
        //coin to quantity
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < bills.length; i++) {
            int curr = bills[i];

            if(curr == 5) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            } else if (curr == 10) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                if(map.getOrDefault(5, 0) <= 0) {
                    return false;
                } else {
                    map.put(5, map.get(5) - 1);
                }
            } else if (curr == 20) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
                int fives = map.getOrDefault(5, 0);
                int tens = map.getOrDefault(10, 0);

                if (tens > 0 && fives > 0) {
                    map.put(10, tens - 1);
                    map.put(5, fives - 1);
                } else if (fives >= 3) {
                    map.put(5, fives - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}