from typing import List


class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        n = int(len(costs) / 2)
        a, b = [], []
        museum = 0
        for cost in costs:
            a.append(cost[0])
            museum += cost[0]
            b.append(cost[1] - cost[0])
        b.sort()
        for i in range(0, n, 1):
            museum += b[i]
        return museum
