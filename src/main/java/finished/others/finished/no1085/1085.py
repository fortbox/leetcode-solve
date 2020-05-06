#  Copyright (c) 2020
#  Author: xiaoweixiang
from typing import List


class Solution:
    def sumOfDigits(self, A: List[int]) -> int:
        num = min(A)
        res = 0
        for i in str(num):
            res += int(i)
        return 1 if res % 2 == 0 else 0
