class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        
        int greaterOrEqual=0;
        int smallOrEqual=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                greaterOrEqual++;
            }
            if(arr[i]<=target){
                smallOrEqual++;
            }
        }
        int[] ans=new int[2];
        ans[0]=smallOrEqual;
        ans[1]=greaterOrEqual;
        return ans;
       
    }
    
}