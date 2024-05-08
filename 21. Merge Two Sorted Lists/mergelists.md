[Merge Two Sorted Lists Description](https://leetcode.com/problems/merge-two-sorted-lists/description/)

# Solution 1: Iterative
We use a dummy and a current node to keep track of the head as well as the current position of adding nodes to the resulting list. If both lists are not null, we compare the values, assign the nodes to list1 or 2 depending on the value comparison, and moving to the next node in list1 and current or list2 and current. At the end, we append the list that still has items in it. We return dummy.next since the head starts after the dummy node. 

Time: `O(m + n)`, where `m` is the length of list1, and `n` is the length of list 2. 
Space: `O(1)`

# Observations
There is a way to do this problem recursively. However, the time complexity will also be `O(m+n)` since it is using recursive stack. 
