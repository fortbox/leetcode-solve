package No11_盛最多水的容器;

public class Solution {

	public static void main(String[] args) {

	}

	/**
	 * 
	 * 1，遍历数组找出面积最大者
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int xi=0,yi=0;
		int xj=0,yj=0;
		int x=0,y=0;
		int area=0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i; j < height.length; j++) {
				xi=i;
				yi=height[i];
				xj=j;
				yj=height[j];
				x=Math.abs(xi-xj);
				y=Math.min(yi, yj);
				if(x*y>area){
					area=x*y;
				}
				
			}
		}
		return area;

	}

}
