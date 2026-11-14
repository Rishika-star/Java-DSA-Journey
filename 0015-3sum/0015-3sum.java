class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            int sum = -nums[i];

            while(left < right) {

                int s = nums[left] + nums[right];

                if(s == sum) {

                    List<Integer> triplet = new ArrayList<>();

    triplet.add(nums[i]);
    triplet.add(nums[left]);
    triplet.add(nums[right]);

    result.add(triplet);
 left++;
    right--;

    while(left < right && nums[left] == nums[left-1]) {
    left++;
}

while(left < right && nums[right] == nums[right+1]) {
    right--;
}
                }

                else if(s < sum) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna