import java.util.Scanner;

import java.util.*;
import java.lang.Math.*;

import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
	private static final Logger logger = LogManager.getLogger(Calculator.class);
	static Calculator calc = new Calculator();
	public static void main(String args[])
	{
		float a, b;
		char choice;
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.print("----Calculator----\n");
			System.out.print("1. Square root function\n");
			System.out.print("2. factorial function\n");
			System.out.print("3. natural logarithm\n");
			System.out.print("4. power\n");
			System.out.print("5. Exit\n\n");
			System.out.print("Enter Your Choice : ");
			choice = scan.next().charAt(0);
			switch(choice)
			{
				case '1' : System.out.print("Enter a Number : ");
					a = scan.nextFloat();
					float res1 = sqrt(a);
					System.out.print("Result = " + res1);
					break;
				case '2' : System.out.print("Enter a Number : ");
					a = scan.nextFloat();
					float res2 = factorial(a) ;
					System.out.print("Result = " + res2);
					break;

				case '3' : System.out.print("Enter a Number : ");
					a = scan.nextFloat();
					float res3 = log(a);
					System.out.print("Result = " + res3);
					break;

				case '4' : System.out.print("Enter two Number : ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					float res4 = power(a, b);
					System.out.print("Result = " + res4);
					break;

				case '5' : System.exit(0);
					break;

				default : System.out.print("Wrong Choice!!!");
					break;
			}
			System.out.print("\n---------------------------------------\n");
		}while(choice != 5);

		scan.close();
	}

	public static float sqrt(float a){
		float res = (float) Math.sqrt(a);
		logger.info("SquareRoot of - " + x + " is - " + res);
		return res;	
	}
	public static float factorial(float a){
		float fact = (float)1.0;
		for (int i = 2; i <= a; i++) {
			fact = fact * i;
		}
		logger.info("Factorial of - " + x + " is - " + fact);
		return fact;
	}

	public static float log(float a){
		float ret = (float)Math.log(a)
		logger.info("Natural log of - " + x + " is - " + ret);
		return ret;
	}

	public static float power(float a, float b){
		float po = (float)Math.pow(a, b)
		logger.info("power of - " + x + ", " + b + " is - " + po);	
		return po;
	}
}

