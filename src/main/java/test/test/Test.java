/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.test;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.HOUR_OF_DAY, -11);
		Date subSpaceTimeUpper = calendar.getTime();

		calendar.setTime(new Date());
		calendar.add(Calendar.HOUR_OF_DAY, -1);
		Date subSpaceTimeLower = calendar.getTime();

		System.out.println(subSpaceTimeUpper);
		System.out.println(subSpaceTimeLower);
	}


}
