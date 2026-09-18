class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
        while(start<=end){
            boolean found=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==start){
                    found=true;
                    break;
                }
            }
            if(found==false){
                return false;
            }
            start++;
        }
        return true;
    }
}