class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
                d = d % n;

                int[] temp = new int[n];
                int j = 0;

                // d ke baad wale elements
                for(int i = d; i < n; i++) {
                    temp[j] = arr[i];
                    j++;
                }

                // first d elements
                for(int i = 0; i < d; i++) {
                    temp[j] = arr[i];
                    j++;
                }

                // temp ko original array mein copy
                for(int i = 0; i < n; i++) {
                    arr[i] = temp[i];
                }
    }
}