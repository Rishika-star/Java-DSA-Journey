class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int n=arr.length;
        int newarr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            newarr[n-1-i]+=arr[i];
        }
        for(int i=0;i<n;i++){
            if(newarr[i]!=arr[i]){
            return false;
        }
        
        }
        return true;
        
    }
}
