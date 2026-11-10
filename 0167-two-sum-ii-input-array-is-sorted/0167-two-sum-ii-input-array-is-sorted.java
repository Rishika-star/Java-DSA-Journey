class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};//1-indexed array
                //normal index return nhi krna not 0 based
            }
            if(sum<target){
                i++;

            }
            else if(sum>target){
                j--;
            }
        }
       return new int[]{-1, -1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna