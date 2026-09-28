class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countX = 0;
                int countY = 0;

                for(int i = 0; i < arr.size(); i++) {
                    if(arr.get(i) == x) {
                        countX++;
                    }

                    if(arr.get(i) == y) {
                        countY++;
                    }
                }

                if(countX > countY) {
                    return x;
                }
                else if(countY > countX) {
                    return y;
                }
                else {
                    return Math.min(x, y);
                }
    }
}