package com.swap_two_numbers;

public class SwapTwoNumbers {
	public void withThirdVariable() {
		int mySalary = 20;
		int superiorSalary = 50;
		System.out.println("Before Swapping " + "Mine :" + mySalary + " Superior : " + superiorSalary);
		int temp = mySalary;
		mySalary = superiorSalary;
		superiorSalary = temp;
		System.out.println("After Swapping " + "Mine :" + mySalary + " Superior : " + superiorSalary);
	}

	public void withoutThirdVariable1() {
		int first = 20;
		int second = 50;
		System.out.println("Before Swapping " + "First :" + first + " Second : " + second);
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("After Swapping " + "First :" + first + " Second : " + second);

	}

	public void withoutThirdVariable2() {
		int first = 20;
		int second = 50;
		System.out.println("Before Swapping " + "First :" + first + " Second : " + second);
		first = first * second;
		second = first / second;
		first = second / first;
		System.out.println("After Swapping " + "First :" + first + " Second : " + second);

	}

	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
		swapTwoNumbers.withThirdVariable();
		swapTwoNumbers.withoutThirdVariable1();
		swapTwoNumbers.withoutThirdVariable2();

	}

}
