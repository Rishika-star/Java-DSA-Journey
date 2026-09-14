class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){//Kyuki 0 % 2 == 0 already true hai. So i == 0 || ki zarurat nahi.So i==0 mt likho
            ans.add(arr[i]);
                
            }
        }
        return ans;
    }
}