#  Copyright (c) 2020
#  Author: xiaoweixiang
class Solution:
    def confusingNumber(self, N: int) -> bool:
        d = {'0': '0', '1': '1', '6': '9', '8': '8', '9': '6'}
        ans = ''
        s = str(N)
        for i in range(len(s)):
            if s[i] in d:
                ans += d[s[i]]
            else:
                return False
        return ans[::-1] != s
