/*class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
     
        }
        return -1;
    }
    
}*/

class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
       for(int i=0;i<nums.length;i++){
         ans=ans^nums[i];
       }
       return ans;
        
    }
    
}
/*1. XOR ki 2 important properties
- a ^ a = 0 → Same numbers XOR hone par cancel ho jaate hain.
- a ^ 0 = a → Kisi number ka 0 ke saath XOR wahi number hota hai.
2. Example se samjho
Array:

[2, 3, 4, 2, 3]

Hum sabhi elements ka XOR karenge:
\[
2 \oplus 3 \oplus 4 \oplus 2 \oplus 3
\]

Same elements ko pair karo:
\[
(2 \oplus 2) \oplus (3 \oplus 3) \oplus 4
\]

\[
= 0 \oplus 0 \oplus 4
\]

\[
= 4
\] */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna