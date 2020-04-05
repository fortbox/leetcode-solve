from typing import List


class Solution:
    def allCellsDistOrder(self, R: int, C: int, r0: int, c0: int) -> List[List[int]]:
        distance = []
        res = []
        for i in range(0, R, 1):
            for j in range(0, C, 1):
                distance.insert(i * C + j, (abs(i - r0) + abs(j - c0), i, j))
        distance = sorted(distance, key=lambda x: x[0])
        for m in range(0, R * C, 1):
            res.append([distance[m][1], distance[m][2]])
        return res
