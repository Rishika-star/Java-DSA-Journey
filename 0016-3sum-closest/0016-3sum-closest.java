class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int max_diff=Integer.MAX_VALUE;
        int result_sum=0;
        for(int i=0;i<nums.length-2;i++){
              int left=i+1;
              int right=n-1;

              while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(sum-target);
                if(diff<max_diff){
                 max_diff=diff;
                 result_sum=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
              }
        }
       return result_sum;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna