class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.containsKey(ch)){
                ans.put(ch, ans.get(ch) + 1);
            }
            else{
                ans.put(ch,1);
            }
        }

        for(int i=0;i<s.length();i++){
            if (ans.get(s.charAt(i)) == 1) {
           return i;
}
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna