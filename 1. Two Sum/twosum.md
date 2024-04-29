[Two Sum Description](https://leetcode.com/problems/two-sum/description/)

# Solution 1: Brute Force
The most "obvious" solution is to use a nested for loop to find all corresponding indices and then find the sum. if we find the target number sum, directly return the indices. 

Time: `O(n^2)`
Space: `O(1)`

# Solution 2: Dictionary
Use a dictionary to store key: each number, value: the index. If the complement of the current number is in the dictionary (complement being the number that can add up to the target with the current number), then we return the value of the complement and the index of the current number.

Time: `O(n)`
Space: `O(n)`