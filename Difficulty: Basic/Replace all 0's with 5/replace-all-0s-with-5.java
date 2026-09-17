class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0){
            return 5;
        }
       int reverse=0;
       while(n>0){
           int digit=n%10;
           if(digit==0){
               digit=5;
           }
           reverse=reverse*10+digit;
           n=n/10;
       }
        int answer=0;
        while(reverse>0){
            int d=reverse% 10;
            answer=answer*10+d;
            reverse=reverse/10;
        }
        return answer;
    }
}