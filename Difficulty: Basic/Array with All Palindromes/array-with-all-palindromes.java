class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        int n=arr.length;
        for(int i=0;i<n;i++){
            int original=arr[i];
            int reverse=0;
            int temp=original;
            
            while(temp>0){
                int last=temp%10;
                reverse=reverse*10+last;
                temp=temp/10;
                
            }
            if(original!=reverse){
                return false;
            }
        }
        return true;
    }
}

/*
Har array element ko ek-ek karke uthao → uska reverse nikalo → original number aur reversed number compare karo → 
agar koi bhi different mila, false → agar sab same mile, true.
*/

