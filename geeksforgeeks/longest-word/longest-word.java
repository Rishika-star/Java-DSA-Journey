class Solution {
    public String longest(String[] arr) {
        // code here
        String longest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()>longest.length()){
                longest=arr[i];
            }
        }
        return longest;
    }
}