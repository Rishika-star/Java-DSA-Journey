class Solution {
    boolean isPalindrome(String s) {
        // code here
        int start = 0;
                int end = s.length() - 1;

                while(start < end) {
                    if(s.charAt(start) != s.charAt(end)) {
                        return false;
                    }

                    start++;
                    end--;
                }

                return true;
    }
}