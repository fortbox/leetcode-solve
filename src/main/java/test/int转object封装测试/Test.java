/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.int转object封装测试;

import java.time.Instant;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		int a = 50;
		Map<String, Object> map = new HashMap<>();
		map.put("total", a);
		//
		// System.out.println(map.get("total"));
		//
		// int i=1;
		// Object o=new Object();
		// System.out.println(o);
		// o=(Object)i;
		// System.out.println(o);
		// System.out.println(o.getClass().getName());
		Test t = new Test();
		t.add();

		int[] b = {1, 2, 3, 4, 5, 7, 6};
		List<Integer> list = Arrays.asList(a);
		System.out.println(list.get(0).getClass().getName());

		ArrayList<Integer> ls = new ArrayList<>(list);

		int[] c = new int[ls.size()];
//		c=ls.toArray();

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		HashMap<String, Object> map1 = new HashMap<>(16);

		Instant.now();


	}

	public void add() {
		Integer i = 1;
		Object o = new Object();
		System.out.println(i);
		o = (Object) i;
		System.out.println(o);
		System.out.println(o.getClass());
	}
}
