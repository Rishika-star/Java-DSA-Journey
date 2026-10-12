class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m=accounts.length;
        int n=accounts[0].length;
        int maxwealth=0;
        for(int i=0;i<m;i++){
            int wealth=0;
            for(int j=0;j<n;j++){
                wealth+=accounts[i][j];
            }
            if(wealth>maxwealth){
                maxwealth=wealth;
            }
        }
        return maxwealth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna