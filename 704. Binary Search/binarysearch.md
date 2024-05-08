[Binary Search Description](https://leetcode.com/problems/binary-search/description/)

# Solution 1: Iterative
This is the most straightforward solution for binary search. Create a low and high index pointer. We check the middle number which is the number at the index between the low and high pointer. If the middle number is lower than the target, then we know to search the second half of the array (from mid + 1 to high index). If the middle number is higher than the target, then we know to search the first half of the array (from low, to mid - 1). If we find the middle number, then we can return the middle index. If we cannot find the middle index and the low and high pointers have crossed each other, then we can return -1.

Time: `O(log(n))`
Space: `O(1)`

# Solution 2: Recursive
The same logic applies to the recursive case. However, this must be broken down into base cases before we use similar conditional logic from above to call the function recursively. The base cases include if the indexes have crossed each other before finding the target number (returning -1) and if the middle number is indeed the target (return the middle index). If none of those are true, we are recursively finding the function, calling the function with different low and high parameters based on the case of if the middle number is too high or too low from the target number. This also uses `O(log(n))` space due to using the call stack. 
Time: `O(log(n))`
Space: `O(log(n))`