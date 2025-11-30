class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        char[] nAsDigitsArray = String.valueOf(n).toCharArray();

        while(true) {
            nAsDigitsArray = String.valueOf(n).toCharArray();
            int newNum = 0;
            for(int i = 0; i < nAsDigitsArray.length; i++) {
                int digit = Integer.parseInt(Character.toString(nAsDigitsArray[i]));
                newNum +=  (digit * digit);
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