class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
           // Q = 1 means INSERT
        if(Q==1){
            int p=Query.get(0);//value
            int r=Query.get(1);//index
            A.add(p,r);
            return A;
   
        }
        // Q = 2 means FIND LAST OCCURRENCE
        else{
            int p=Query.get(0);
            for(int i=A.size()-1;i>=0;i--){
                if(A.get(i)==p){
                    ArrayList<Integer> ans=new ArrayList<>();
                    ans.add(i);
                    return ans;
                }
            }
             // value nahi mili
             ArrayList<Integer> ans=new ArrayList<>();
             ans.add(-1);
             return ans;
            
        }
        
        
    }
}