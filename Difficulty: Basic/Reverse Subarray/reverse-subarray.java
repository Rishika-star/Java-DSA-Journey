class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        // code here
        int left=l-1;
        int right=r-1;
        while(left<=right){
            int temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            
            left++;
            right--;
        }
        return arr;
    }
    
}