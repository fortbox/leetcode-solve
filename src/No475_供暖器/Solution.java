package No475_供暖器;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] houses = { 282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923 };
		int[] heaters = { 823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729,
				823378840, 143542612 };
//		int[] houses = { 1, 2, 3 };
//		int[] heaters = { 2 };
		Solution solution = new Solution();
		System.out.println(solution.findRadius_1(houses, heaters));
	}

	/**
	 * 想法是对的，不过代码有点冗余
	 */
	public int findRadius(int[] houses, int[] heaters) {
		int c = 0;
		int temp = 0;
		Arrays.parallelSort(houses);
		Arrays.parallelSort(heaters);
//		System.out.println("houses" + houses);
//		System.out.println("heaters" + heaters);
		for (int i = 0; i < houses.length; i++) {
			int j = 0;
			while (j < heaters.length) {
				int n1 = Math.abs(houses[i] - heaters[j]);
				if (j < heaters.length - 1) {
					int n2 = Math.abs(houses[i] - heaters[j + 1]);
					if (n1 >= n2) {
						j++;
					} else {
//						System.out.println("c:" + c);
						temp = Math.min(n1, n2);
						if (temp > c) {
							c = temp;
						}
						break;
					}
				} else {
					temp = n1;
					if (temp > c) {
						c = temp;
					}
					j++;
				}
			}

		}
		return c;
	}

	public int findRadius_1(int[] houses, int[] heaters) {
		int c = 0;
		int temp = 0;
		Arrays.parallelSort(houses);
		Arrays.parallelSort(heaters);
		for (int i = 0; i < houses.length; i++) {
			int j = 0;
			while ((j < (heaters.length - 1) )&& (Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1]))) {
				j++;
			}
			c=Math.max(c, Math.abs(houses[i] - heaters[j]));

		}
		return c;
	}
}
