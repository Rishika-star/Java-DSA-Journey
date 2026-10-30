class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected_sum=n*(n+1)/2;
        int actual_Sum=0;
        for(int i=0;i<n;i++){
            actual_Sum+=nums[i];
        }
        return expected_sum-actual_Sum;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna