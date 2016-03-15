package test;

import java.util.Scanner;

public class Time {
	public static void main(String[] args){
		long totalMillseconds = System.currentTimeMillis();
		long totalSeconds = totalMillseconds / 1000;
		long CurrentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long CurrentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long CurrentHours = totalHours % 24;
		
		Scanner input = new Scanner(System.in);
		//create a Scanner
		
		System.out.println("the area is:");
		int area = input.nextInt();
		CurrentHours = (CurrentHours + area) % 24;
		
		System.out.println("Current time is" + CurrentHours + ":" + CurrentMinute + ":"
				+ CurrentSecond);
	}
}
