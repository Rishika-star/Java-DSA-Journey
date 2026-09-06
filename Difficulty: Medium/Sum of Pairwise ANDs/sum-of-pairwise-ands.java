class Solution {
    public long pairAndSum(int[] arr) {
        // code here
      long sum = 0;
             int n = arr.length;

             for (int bit = 0; bit < 31; bit++) {
                 long count = 0;

                 for (int i = 0; i < n; i++) {
                     if ((arr[i] & (1 << bit)) != 0) {
                         count++;
                     }
                 }

                 long pairs = count * (count - 1) / 2;
                 sum += pairs * (1L << bit);
             }

             return sum;
         }
}