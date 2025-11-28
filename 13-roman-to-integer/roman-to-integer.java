class Solution {
    public int romanToInt(String s) {
        char[] sArray = s.toCharArray();
        int number = 0;
        int prevNum = -1;
        for(int i = sArray.length - 1; i >= 0; i--) {
            char c = sArray[i];

            int num = 0;
        
            if(c == 'I') {
                num = 1;
            } else if(c == 'V') {
                num = 5;
            } else if(c == 'X') {
                num = 10;
            } else if(c == 'L') {
                num = 50;
            } else if(c == 'C') {
                num = 100;
            } else if(c == 'D') {
                num = 500;
            } else {
                num = 1000;
            }
            if(prevNum != -1 && prevNum > num) {
                number -= num;
            } else {
                number += num;
            }

            prevNum = num;
        }
        return number;
    }
}