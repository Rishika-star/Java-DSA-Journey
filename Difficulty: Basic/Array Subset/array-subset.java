
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

               // Count elements of a
               for(int i = 0; i < a.length; i++) {
                   map.put(a[i], map.getOrDefault(a[i], 0) + 1);
               }

               // Check elements of b
               for(int i = 0; i < b.length; i++) {

                   if(!map.containsKey(b[i]) || map.get(b[i]) == 0) {
                       return false;
                   }

                   map.put(b[i], map.get(b[i]) - 1);
               }

               return true;
    }
}
