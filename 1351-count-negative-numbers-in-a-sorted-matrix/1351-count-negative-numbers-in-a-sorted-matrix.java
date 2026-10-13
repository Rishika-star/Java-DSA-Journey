class Solution {
    public int countNegatives(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna