class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        for(;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            int j=n-1;
            for(;j>=0;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        int left=i+1;
        int right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna