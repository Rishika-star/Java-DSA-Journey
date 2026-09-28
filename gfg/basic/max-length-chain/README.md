# Sum Except First and Last

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr**  of numbers. Return the sum of all the elements except the first and last elements.

 **Examples:** 

```
Input: arr[] = [5, 24, 39, 60, 15, 28, 27, 40, 50, 90]
Output: 283
Explanation: The sum of all the elements except the first and last element is 283.

```

```
Input: arr[] = [5, 10, 1, 11]
Output: 11
Explanation: The sum of all the elements except the first and last element is 11.

```

```
Input: arr[] = [5, 10]
Output: 0
Explanation: The sum of all the elements except the first and last element is 0.
```

 **Constraints:** 
2<=arr.size()<=105
2<=arr[i]<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T08:25:00.903Z  

```java
class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum = 0;

               for(int i = 1; i < arr.length - 1; i++) {
                   sum += arr[i];
               }

               return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-length-chain/1)