class Solution {
    public int coin(int[] arr) {
        // code here
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return arr[left];//left==right left ki jgh right bhi likh skte h
        //ye wo condition hogi jb array me ek coin bachega bs
    }
}