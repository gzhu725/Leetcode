class Solution(object):
  def twoSum(self, nums, target):
    res = list()
    for i in range(len(nums)):
      for j in range(i+1, len(nums)):
        if (nums[i] + nums[j] == target):
          res.append(i)
          res.append(j)
    return res
  def bestTwoSum(self, nums, target):
    res = list()
    d = {}
    for i in range(len(nums)):
      if target - nums[i] in d:
        res.append(d[target- nums[i]])
        res.append(i)
      else:
        d[nums[i]] = i
    return res





p = Solution()
print(p.bestTwoSum([2,7,11,15], 9)) #sample input case 1, you can also use brute force function for same answer
print(p.bestTwoSum([3,2,4], 6)) #sample input case 2