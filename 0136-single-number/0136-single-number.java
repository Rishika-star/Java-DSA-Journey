/*class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
     
        }
        return -1;
    }
    
}*/

class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
         ans=ans^nums[i];
       }
       return ans;
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna