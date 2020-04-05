package No1029_两地调度

import "sort"

func twoCitySchedCost(costs [][]int) int {
	var a int = len(costs) / 2
	var b [] int = make([]int, a)
	var c [] int = make([]int, a)
	var sum int
	for i := 0; i < len(costs); i++ {
		b[i] = costs[i][0]
		sum += costs[i][0]
		c[i] = costs[i][1] - costs[i][0]
	}
	sort.Ints(c)

	for i := 0; i < a; i++ {
		sum += c[i]
	}
	return sum
}
