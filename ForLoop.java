package com.basic;
import java.util.Scanner;

public class ForLoop {
	
	private int number;
	
	ForLoop(int number){
		this.number = number;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = obj.nextInt();
		//obj.close();
		ForLoop myObj = new ForLoop(number);
		int sum = myObj.sumUpto();
		System.out.println("Sum upto N numbers = " + sum);
		int divisorsSum = myObj.sumOfDivisors();
		System.out.println("Sum of divisors = " + divisorsSum);
		boolean prime = myObj.isPrime();
		System.out.println("The number is prime. " + prime);
		myObj.printNumberTriangle();
		myObj.whileLoopSquares();
		myObj.whileLoopCubes();
		myObj.doWhilePositiveCubes();
	}
	
	void doWhilePositiveCubes() {
		int i = 0;
		do {
			Scanner newObj = new Scanner(System.in);
			System.out.print("Enter a number to find cube and enter a negative number to exit: ");
			i = newObj.nextInt();
			if (i>0) {
			System.out.println(i*i*i);
			}
		}while (i>=0);
		System.out.println("Thank you for using me!!!");
	}
	
	void whileLoopCubes() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to print cubes: ");
		int number = obj.nextInt();
		int t=1;
		while (t*t*t<=number) {
			System.out.print(t*t*t+" ");
			t=t+1;
		}
		System.out.println();
		
	}
	void whileLoopSquares() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to print squares: ");
		int number = obj.nextInt();
		int t=1;
		while (t*t <= number) {
			System.out.print(t*t + " ");
			t=t+1;
		}
		System.out.println();
	}
	void printNumberTriangle() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to print number triangle: ");
		int number = obj.nextInt();
		for (int i = 1;i<=number;i++) {
			for (int j = 1; j<=i;j++) {
				System.out.print(j+ " ");
			}
		System.out.println();
		}
	}
	
	int sumOfDivisors() {
		int sum = 0;
		for (int i=2;i<=this.number-1;i++) {
			if (this.number%i==0) {
				sum = sum+i;
			}
		}
		return sum;
	}
	
	boolean isPrime() {
		boolean flag = true;
		for (int i=2;i<=(this.number)/2;i++) {
			if (this.number%i==0) {
				flag = false;
			}
		}
		return flag;
	}
	
	int sumUpto() {
		int sum = 0;
		for (int i=1;i<=this.number;i++) {
			sum= sum + i;
		}
		return sum;
	}

}
