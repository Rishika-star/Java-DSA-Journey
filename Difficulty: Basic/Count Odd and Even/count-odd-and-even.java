class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n=arr.length;
        int odd=0;
        int even=0;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        
        ans[0]=odd;//jo ans name ka array bna usme 0th index pe odd count store hoga
        ans[1]=even;//1st index pe even count store hoga
        return ans;
    }
}

/*
1.RETURN TYPE int h na ki ArrayList
isliye arraylist mt bnadena make an array with 
datatype int

2.int[] a=new int[2]; size fix krdiya kyuki hume que me bola 
h ki 2 elements hi return krwane h

*/