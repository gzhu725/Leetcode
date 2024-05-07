class Solution(object):
    def isValid(self, s):
        d = {'(': ')',
            '[':']',
            '{': '}'
        }
        st = list()
        for char in s:
            if not st or char in d: 
                st.append(char)
                continue
            if d[st[-1]] == char:
                st.pop()
            else:
                st.append(char)
        return len(st) == 0

# s = Solution()
# print(s.isValid("()[]"))