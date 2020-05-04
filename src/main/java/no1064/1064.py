#  Copyright (c) 2020
#  Author: xiaoweixiang
from typing import List


class Solution:
    def fixedPoint(self, A: List[int]) -> int:
        """
        Python解法参考其他人
        :param A:
        :return:
        """
        for i in range(len(A)):
            if A[i] == i:
                return i
        return -1
