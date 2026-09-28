# Missing in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **arr[]**  of size  **n - 1**  that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

```

```
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
```

```
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size() + 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T08:22:31.326Z  

```java
class Solution {
    int missingNum(int arr[]) {
        // code here
       long n = arr.length + 1;

               long total = n * (n + 1) / 2;

               long sum = 0;
               for(int i = 0; i < arr.length; i++) {
                   sum += arr[i];
               }

               return (int)(total - sum);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1)