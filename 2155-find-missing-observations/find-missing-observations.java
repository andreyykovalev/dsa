class Solution {
    public int[] missingRolls(int[] rolls, int mean, int missingCount) {
        
        int knownSum = 0;
        for(int i = 0; i < rolls.length; i++) {
            knownSum += rolls[i];
        }

        int totalRolls = rolls.length + missingCount;
        int totalSum = totalRolls * mean;
        int remainingSum = totalSum - knownSum;

        if(remainingSum > missingCount * 6 || remainingSum < missingCount) {
            return new int[]{};
        }

        int[] missingRolls = new int[missingCount];
        Arrays.fill(missingRolls, 1);

        remainingSum -= missingCount;

        int j = 0;
        while(remainingSum > 0) {
            if(missingRolls[j] == 6) {
                j++;
                continue;
            }
            missingRolls[j]++;
            remainingSum--;
        }
        return missingRolls;
    }
}