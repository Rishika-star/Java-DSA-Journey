class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                   sum+=a[i][j]; 
                }
            }
        }
        
        int max=b[0];
        for(int i=0;i<n;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(sum);
        ans.add(max);
        return ans;
    }
}
