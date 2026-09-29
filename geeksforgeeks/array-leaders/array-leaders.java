class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int temp=list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);
        start++;
        end--;
        }
        return list;
    }
}
