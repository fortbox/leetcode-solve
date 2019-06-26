/**
 * 
 */
package No463_岛屿的周长;

/**
 * @author Henry Xiao
 * @date 2019年6月27日
 */
public class Solution {

	/**
	 * @see 只需要考虑上左就好
	 */
	public int islandPerimeter(int[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					count += 4;
				}

				if (i - 1 >= 0) {
					if (grid[i][j] == 1 && grid[i - 1][j] == 1) {
						count -= 2;
					}
				}
				if (j - 1 >= 0) {
					if (grid[i][j] == 1 && grid[i][j - 1] == 1) {
						count -= 2;
					}
				}
			}
		}
		return count;
	}
}
