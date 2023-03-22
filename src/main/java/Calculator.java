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

	/*public static double squareroot(float x)
	{
		if(x < 0)
		{
			logger.info("Error - Negative Number");
		}
		// logger.info();
		double res = 0;
		res = Math.sqrt(x);
		logger.info("SquareRoot of - " + x + " is - " + res);
		return res;
	}

	public static long factorial(float x)
	{
		if(x < 0){
			logger.error("Error - Negative Number");
			return -1;
		}
		// logger.info();
		long res = 1;
		for(int i=1; i<=x; i++)
		{
			res *= i;
		}
		logger.info("Factorial of - " + x + " is - " + res);
		return res;
	}

	public static double lnx(float x)
	{
		if(x < 0)
		{
			logger.error("Error - Negative Number");
		}
		// logger.info();
		double ret = Math.log(x);
		logger.info("Natural log of - " + x + " is - " + ret);
		return ret;
	}

	public static long power(float x, float b)
	{
		// logger.info();
		long res = 1;
		for(int i=1; i<=b; i++)
		{
			res *= x;
		}
		logger.info("power of - " + x + ", " + b + " is - " + res);
		return res;
	}*/

	public static float sqrt(float a){
		return (float) Math.sqrt(a);
	}
	public static float factorial(float a){
		float fact = (float)1.0;
		for (int i = 2; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static float log(float a){
		return (float)Math.log(a);
	}

	public static float power(float a, float b){
		return (float)Math.pow(a, b);
	}
}

