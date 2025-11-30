class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while(true) {
            int temp = n;
            int newNum = 0;
            while(temp > 0) {
                int digit = temp % 10;
                newNum +=  digit * digit;
                temp = temp / 10;
            }
            if(newNum == 1) {
                return true;
            }
            if(seenNumbers.contains(newNum)) {
                return false;
            } else {
                seenNumbers.add(newNum);
            }
            n = newNum;
        }
    }
}