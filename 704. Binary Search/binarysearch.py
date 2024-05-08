class Solution(object):
    def binarySearch(self, nums, target, low, high):
        mid = (low + high) // 2
        cur = nums[mid]
        if low > high:
            return -1
        if cur < target:
            return self.binarySearch(nums, target, mid + 1, high)
        elif cur > target:
            return self.binarySearch(nums, target, low, mid - 1)
        elif cur == target:
            return mid

    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low = 0
        high = len(nums) - 1
        return self.binarySearch(nums, target, low, high)


#s = Solution()
#nums = [-1, 0, 1, 5, 6]
#s.search(nums, 1)
# RECURSIVE APPROACH