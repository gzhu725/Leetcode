import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
      for(int i = 0; i < nums.length; i++)
      {
        for(int j = i + 1; j < nums.length; j++)
        {
          if(nums[i] + nums[j] == target) {
            System.out.println(i);
            System.out.println(j);
            return new int[]{i,j};
          }
        }
      }
      return new int[]{-1,-1};
  }

  public int[] bestTwoSum(int[] nums, int target)
  {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++)
    {
      if(hm.containsKey(target- nums[i]))
      {
        System.out.println(i);
        System.out.println(hm.get(target - nums[i]));
        return new int[]{hm.get(target-nums[i]), i};
      }
      else
      {
        hm.put(nums[i], i);
      }
    }
    return new int[]{-1,-1};
  }

  public static void main(String[] args)
  {
    Solution s = new Solution();
    s.bestTwoSum(new int[]{2,7,11,19}, 9);
  }
}