package int转object封装测试;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int a=50;
		Map<String, Object> map=new HashMap<>();
		map.put("total", a);
//		
//		System.out.println(map.get("total"));
//		
//		int i=1;
//		Object o=new Object();
//		System.out.println(o);
//		o=(Object)i;
//		System.out.println(o);
//		System.out.println(o.getClass().getName());
		Test t=new Test();
		t.add();

	}
	
	public void add() {
		Integer i=1;
		Object o=new Object();
		System.out.println(i);
		o=(Object)i;
		System.out.println(o);
		System.out.println(o.getClass());
	}

}
