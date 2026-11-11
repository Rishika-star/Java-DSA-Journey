class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int[] res=new int[nums.length];
       int i=0;
       int j=n-1;
       int k=n-1;
       while(i<=j){
        if(nums[i]*nums[i]>nums[j]*nums[j]){
            res[k]=nums[i]*nums[i];
            i++;
        }
        else{
            res[k]=nums[j]*nums[j];
            j--;
        }
        k--;
       } 
       return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna