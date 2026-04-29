class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        //i = customer
        for(int i = 0; i < accounts.length; i++) {

            int ithCustomerWealth = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                ithCustomerWealth += accounts[i][j];
            }

            maxWealth = Math.max(ithCustomerWealth, maxWealth);
        }
        return maxWealth;

    }
}