package com.test;

import java.util.Scanner;

import com.calculator.CalculatorImpl;
import com.calculator.CalculatorImplService;

public class Test {

	public static void main(String[] args) {
		CalculatorImplService wsdl = new CalculatorImplService();
		CalculatorImpl service = wsdl.getCalculatorImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Please enter the second number");
			int num2 = sc.nextInt();
			System.out.println(
					"Please enter process number" + "\n1.Add" + "\n2.Substract" + "\n3.Divide" + "\n4.Multiply" + "\n5.Exit");
			int processNum = sc.nextInt();
			int result = 0;
			boolean proccessComplete = true;
			if (processNum == 1) {
				result = service.add(num1, num2);
			} else if (processNum == 2) {
				result = service.substract(num1, num2);
			} else if (processNum == 3) {
				if (num2 != 0) {
					result = service.divide(num1, num2);
				} else {
					System.out.println("Dividing 0 error");
				}
			} else if (processNum == 4) {
				result = service.multiply(num1, num2);
			} else if (processNum == 5) {
				sc.close();
				break;
			} else {
				System.out.println("Wrong process number");
				proccessComplete = false;
			}

			if (proccessComplete) {
				System.out.println("Result = " + result);
			}
		}

	}

}
