/**
 * 
 */
package No447_回旋镖的数量;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author Henry Xiao
 * @date 2019年6月20日
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 计算两个点之间的距离
	 */
	public int numberOfBoomerangs(int[][] points) {
		int len = points.length;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				int x1 = points[i][0];
				int y1 = points[i][1];
				int x2 = points[j][0];
				int y2 = points[j][1];
				int dis = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
				if (!map.containsKey(dis)) {
                    map.put(dis, 0);
                }
                //两个位置可以j k可以颠倒
//                count += map.get(dis) * 2;
                map.put(dis, map.get(dis) + 1);
			}
			for (int value : map.values()) {
				count+=value*(value-1);
			}
//			System.out.println(map);
			map.clear();
		}
		return count;
	}

}
