
import java.util.Scanner;
import java.lang.Math;
 public class Calculator
  {
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

    public static void main(String[] args)
     {
       float a, b, res;
       char choice;
		 Scanner scan = new Scanner(System.in);

      	do
         {
	   System.out.print("Calculator demo\n");
           System.out.print("1. Square root\n");
           System.out.print("2. Factorial\n");
           System.out.print("3. Natural logarithm (base e)\n");
           System.out.print("4. Power\n");
           System.out.print("5. Exit\n\n");
           System.out.print("Enter Your Choice : ");
           choice = scan.next().charAt(0);
			 switch (choice) {
				 case '1' -> {
					 System.out.print("Enter One Number : ");
					 a = scan.nextFloat();
					 res = sqrt(a);
					 System.out.print("Result = " + res);
				 }
				 case '2' -> {
					 System.out.print("Enter One Number : ");
					 a = scan.nextFloat();
					 res = factorial(a);
					 System.out.print("Result = " + res);
				 }
				 case '3' -> {
					 System.out.print("Enter One Number : ");
					 a = scan.nextFloat();
					 res = log(a);
					 System.out.print("Result = " + res);
				 }
				 case '4' -> {
					 System.out.print("Enter Two Number : ");
					 a = scan.nextFloat();
					 b = scan.nextFloat();
					 res = power(a,b);
					 System.out.print("Result = " + res);
				 }
				 case '5' -> System.exit(0);
				 default -> System.out.print("Wrong Choice!!!");
			 }
																	            System.out.print("\n---------------------------------------\n");
	}while(choice != 5);
    }
}
