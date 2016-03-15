package test;

import java.util.Scanner;

public class sum {
	public static void main(String[] args){
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000:");
		int number = input.nextInt();
		if(number > 1000)                      //对输入数字进行判断
			System.out.println("the number is wrong!");
		else{
			int sum=sum(number);               //调用求和函数
			System.out.println("The sum of the digits is " + sum);
		}
	}
	/*求各位数字之和*/
	public static int sum(int number){
		int sum = 0;
		while(number > 0){
			sum = number % 10 + sum;
			number = number / 10;
		}
		return sum;
	}
}
