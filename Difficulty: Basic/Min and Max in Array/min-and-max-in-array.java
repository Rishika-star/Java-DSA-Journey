class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n=arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
