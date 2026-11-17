class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex=0;
        int oddIndex=1;
        while(evenIndex<nums.length && oddIndex<nums.length){
            if(nums[evenIndex]%2==0){
                evenIndex+=2;
            }
            else if(nums[oddIndex]%2!=0){
                oddIndex+=2;
            }
            else{
                int temp=nums[evenIndex];
                nums[evenIndex]=nums[oddIndex];
                nums[oddIndex]=temp;
            }
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna