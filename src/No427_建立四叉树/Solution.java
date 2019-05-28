package No427_建立四叉树;

public class Solution {

	class Node {
		public boolean val;
		public boolean isLeaf;
		public Node topLeft;
		public Node topRight;
		public Node bottomLeft;
		public Node bottomRight;

		public Node() {
		}

		public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
			val = _val;
			isLeaf = _isLeaf;
			topLeft = _topLeft;
			topRight = _topRight;
			bottomLeft = _bottomLeft;
			bottomRight = _bottomRight;
		}
	};

	public Node construct(int[][] grid) {
		return build(grid, 0, 0, grid.length);

	}

	private Node build(int[][] grid, int x, int y, int length) {
		if (length <= 0) {
			return null;
		}
		for (int i = x; i < x + length; i++) {
			for (int j = y; j < y + length; j++) {
				if (grid[i][j] != grid[x][y]) {
					return new Node(true, false, build(grid, x, y, length / 2), build(grid, x, y+(length/2), length / 2),
							build(grid, x+(length/2), y, length/2), build(grid, x+(length/2), y+(length/2), length/2));

				}
			}
		}
		return new Node(grid[x][y]==1, true, null, null, null, null);
		
	}
}
