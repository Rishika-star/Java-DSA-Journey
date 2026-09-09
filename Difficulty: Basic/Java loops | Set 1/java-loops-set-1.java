class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=N;i++){//<= condition dalo
        //i ko 1 se start kro
            if(i%2==0){
                sum1+=i;//Question mein chahiye:
        //even numbers ka sum aur odd numbers ka sum
        //count inc nhi krna h elements ko add krte jana h
            }
            else{
                sum2+=i;
            }
            
            
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(sum1);
        ans.add(sum2);
        return ans;
    }
}