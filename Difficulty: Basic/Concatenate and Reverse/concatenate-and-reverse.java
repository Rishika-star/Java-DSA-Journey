class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String concat=s1+s2;
        String result="";
        for(int i=concat.length()-1;i>=0;i--){
            result+=concat.charAt(i);
        }
        return result;//result return krwana h not concat
    }
}