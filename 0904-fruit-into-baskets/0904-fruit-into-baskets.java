class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        int low = 0;
        int high = 0;
        int result = 0;

        for (high = 0; high < fruits.length; high++) {

            int fruit = fruits[high];
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);

            while (freq.size() > 2) {

                int left = fruits[low];

                freq.put(left, freq.get(left) - 1);

                if (freq.get(left) == 0) {
                    freq.remove(left);
                }

                low++;
            }

            result = Math.max(result, high - low + 1);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna