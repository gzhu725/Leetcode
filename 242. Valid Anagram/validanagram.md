[Valid Anagram Description](https://leetcode.com/problems/two-sum/description/)

# Solution 1: Hash Table Using Array
Use an array with 26 slots, each initialized to 0 to represent the letter count. If the length of s and t are different, we automatically know they cannot be anagrams. We fill the array with the letter counts for string s. We subtract each letter count by 1 for each letter we visit in t. If there are still letter counts left in the array that are not 0, we know s and t are not anagrams since not all letters were used up. 

Time: `O(n)`
Space: `O(1)`

# Note
There are many ways to do this - I first tried using a dictionary, but this solution guarantees constant space; the array always will be length 26.