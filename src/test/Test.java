package test;

import java.util.Date;
import java.util.Calendar;

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
