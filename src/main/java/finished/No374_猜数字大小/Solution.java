/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No374_猜数字大小;

public class Solution extends GuessGame{

	public int guessNumber(int n) {
		return guessG(1,n);
	}
	public int guessG(int low,int high) {
		if (high-low<=1) {
			return guess(low)==0?low:high;
		}

		
		int temp=low+(high-low)/2;

		System.out.println("temp="+temp);
		int r=guess(temp);
		if (r==1) {
			System.out.println("r==1,"+"from="+temp+",to="+high);
			return guessG(temp,high);
		}else if(r==0){
			System.out.println("r==0,"+"from="+temp+",to="+temp);
			return temp;
		}else if(r==-1) {
			System.out.println("r==-1,"+"from="+low+",to="+temp);
			return guessG(low,temp);
		}
		return 0;
	}
}
