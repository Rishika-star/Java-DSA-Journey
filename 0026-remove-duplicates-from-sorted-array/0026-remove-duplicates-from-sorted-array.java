class Solution {
    public int removeDuplicates(int[] nums) {
         int officer=0;
         int unique=1;
         int cm=1;
         while(cm<nums.length){
            //DUPLICATE
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            //UNIQUE
            nums[officer+1]=nums[cm];
            officer++;
            unique++;
            cm++;
         }
           return unique;
    }
  
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna