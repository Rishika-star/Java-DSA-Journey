class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int q = n / m;

               int num1 = q * m;
               int num2;

               if(n * m > 0) {
                   num2 = (q + 1) * m;
               } else {
                   num2 = (q - 1) * m;
               }

               int diff1 = Math.abs(n - num1);
               int diff2 = Math.abs(n - num2);

               if(diff1 < diff2) {
                   return num1;
               }
               else if(diff2 < diff1) {
                   return num2;
               }
               else {
                   return Math.abs(num1) > Math.abs(num2) ? num1 : num2;
               }
    }
}