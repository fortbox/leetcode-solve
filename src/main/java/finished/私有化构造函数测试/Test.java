/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.私有化构造函数测试;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		A a=A.creatInstance();
		A b=A.creatInstance();
		System.out.println(a);
		System.out.println(b);
		Set set=new HashSet();

	}

}
