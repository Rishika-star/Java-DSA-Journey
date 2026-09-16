class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
