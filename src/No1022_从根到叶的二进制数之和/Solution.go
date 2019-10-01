package No1022_从根到叶的二进制数之和

//Definition for a binary tree node.
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func sumRootToLeaf(root *TreeNode) int {
	return dfsSum(root, 0)
}
func dfsSum(root *TreeNode, sum int) int {
	if root == nil {
		return 0
	}
	sum = (sum << 1) + root.Val
	if root.Left == nil && root.Right == nil {
		return sum
	}
	return dfsSum(root.Left, sum) + dfsSum(root.Right, sum)
}
