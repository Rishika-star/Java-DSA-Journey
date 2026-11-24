class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
                int len=high-low+1;
            result=Math.min(result,len);
            sum=sum-nums[low];
            low++;
            }
            high++;
            
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
    
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna