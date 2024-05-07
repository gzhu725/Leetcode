[Valid Parentheses Description](https://leetcode.com/problems/valid-parentheses/description/)

# Solution 1: Stack and HashMap
Use a stack to track whether the string is valid, and a hashmap to map each opening parentheses with its closing pair. We loop through the string and do the following: if the character is an opening parentheses, add to the stack. if the stack is either empty before adding a closing parenthesis or the closing parenthesis does not match the opening one, we can immediately return false since there is no way to match that parenthesis with its pair. At the end, if the stack is empty then we have a valid string. 

Time: `O(n)`
Space: `O(n)`

# Observations
My python solution uses different logic but yields the same answer. However, the logic described above is a little more efficient since it does not need to take up `O(s.length())` time total, and can break off earlier. 

