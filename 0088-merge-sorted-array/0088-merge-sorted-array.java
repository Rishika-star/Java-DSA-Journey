class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res=new int[m+n];
       int i=0;
       int j=0;
       int k=0;
       while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
            res[k]=nums1[i];
            i++;
            k++;
        }
        else{
            res[k]=nums2[j];
            k++;
            j++;
        }
       }

       while(i<m){//nums2 k elements khtm ho chuke h
        res[k]=nums1[i];
        i++;
        k++;
       }
       while(j<n){
        res[k]=nums2[j];
        k++;
        j++;
       }
       for(int x=0;x<m+n;x++){
        nums1[x]=res[x];
       }
    }
    
}
// Yahan void ka matlab hai kuch return nahi karna. therefore no return
/*Aur question mein explicitly likha hai:
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.*/

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna