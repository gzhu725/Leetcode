class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        letterCount = [0] * 26
        if len(s) != len(t):
            return False
        for char in s:
            letterCount[ord(char) - ord('a')]+=1
        for char in t:
            letterCount[ord(char) - ord('a')]-=1
        for val in letterCount:
            if val != 0:
                return False
        return True

#p = Solution()
#print(p.isAnagram("tar", "rat"))