package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int n = in.nextInt();
		boolean isLeap1 = (n%400==0);
		boolean isLeap2 = (n%4==0 && n%100!=0);
		boolean isLeap = (isLeap1==true || isLeap2==true);
			
		System.out.println(isLeap);

	}

}
