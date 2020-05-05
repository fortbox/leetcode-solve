#  Copyright (c) 2020
#  Author: xiaoweixiang

from typing import List


class Solution:
    def highFive(self, items: List[List[int]]) -> List[List[int]]:
        d = {}
        for i, score in items:
            if i in d:
                if len(d[i]) < 5:
                    d[i].append(score)
                    d[i].sort()
                else:
                    if d[i][0] < score:
                        d[i][0] = score
                        d[i].sort()
            else:
                d[i] = [score]
        return [[i, sum(d[i]) // 5] for i in d.keys()]
