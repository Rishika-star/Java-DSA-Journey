
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=x){
                count++;
            }
        }
        return count;
        
    }
}

/*
1.arr.size()- Kyuki yahan arr array nahi, List<Integer> hai.
2.if(arr.get(i)<=x)
List ke index i wale element ko x 
se compare karo—agar woh chhota ya equal hai, toh count karo.

*/