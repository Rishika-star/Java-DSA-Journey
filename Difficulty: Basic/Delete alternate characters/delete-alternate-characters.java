class Solution {
    static String delAlternate(String s) {
        // code here
        String result="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                result+=s.charAt(i);
            }
        }
        return result;
    }
}