class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int k = 0;

        for(int i = 0, j = n; i < n; i++, j++) {

            result[k] = nums[i];
            k++;

            result[k] = nums[j];
            k++;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna