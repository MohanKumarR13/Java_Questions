package com.number.reverse;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int given_Number = 0;
		int reverse_Number = 0;
		//Scanner
		System.out.println("Enter Your Number");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		given_Number=scanner.nextInt();
		while (given_Number != 0) {
			reverse_Number = reverse_Number * 10;
			reverse_Number = reverse_Number + given_Number % 10;
			given_Number = given_Number / 10;

			/* System.out.println(123%10); System.out.println(123/10); */

		}
		System.out.println(reverse_Number);
	}

}
