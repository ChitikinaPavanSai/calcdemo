package com.example.calcdemo;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Arithmetic arithmetic = null;
		System.out.println("Calculator:\n1. Adddition\n2.Substraction\n3. Multiplication\n4. Division\nEnter a number corresponding to operation");
		int option = scanner.nextInt();
		double op1, op2, result;
		System.out.println("Enter the operands");
		op1 = scanner.nextInt();
		op2 = scanner.nextInt();
		if (option==1)
		{
			arithmetic = new addition();
		}
		else if (option==2)
		{
			arithmetic = new Substraction();
		}
		else if (option==3)
		{
			arithmetic = new Multiplication();
		}
		else
		{
			arithmetic = new Division();
		}
		result = arithmetic.evaluate(op1, op2);
		System.out.println("Result : "+result);
	}
}
