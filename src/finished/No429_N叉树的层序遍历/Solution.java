package finished.No429_N叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	/**
	 * bfs用队列，dfs用栈
	 * 
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrder(Node root) {
		if (root==null) {
			return null;
		}
		Queue<Node> queue = new LinkedList<>();
		List<List<Integer>> list = new ArrayList<>();

		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> listnum = new ArrayList<>();
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				listnum.add(queue.peek().val);
				List<Node> ch = queue.poll().children;
				for (Node node : ch) {
					queue.add(node);
				}
			}
			list.add(listnum);
		}
		return list;
	}

//Definition for a Node.
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
}
