class Solution {
    public int romanToInt(String s) {
         int total = 0;

        for(int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if(i + 1 < s.length() &&
               current < value(s.charAt(i + 1))) {
                total = total - current;
            }
            else {
                total = total + current;
            }
        }

        return total;
    }

    int value(char ch) {
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        return 1000;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna