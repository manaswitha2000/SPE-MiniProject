
import java.util.Scanner;

 public class Calculator
  {
	  public static float add(float a, float b){
	      return a+b;
	  }
    public static void main(String[] args)
     {
       float a, b, res;
       char choice;
		 Scanner scan = new Scanner(System.in);

      	do
         {
	   System.out.print("Calculator demo\n");
           System.out.print("1. Addition\n");
           System.out.print("2. Subtraction\n");
           System.out.print("3. Multiplication\n");
           System.out.print("4. Division\n");
           System.out.print("5. Exit\n\n");
           System.out.print("Enter Your Choice : ");
           choice = scan.next().charAt(0);
			 switch (choice) {
				 case '1' -> {
					 System.out.print("Enter Two Number : ");
					 a = scan.nextFloat();
					 b = scan.nextFloat();
					 res = add(a,b);
					 System.out.print("Result = " + res);
				 }
				 case '2' -> {
					 System.out.print("Enter Two Number : ");
					 a = scan.nextFloat();
					 b = scan.nextFloat();
					 res = a - b;
					 System.out.print("Result = " + res);
				 }
				 case '3' -> {
					 System.out.print("Enter Two Number : ");
					 a = scan.nextFloat();
					 b = scan.nextFloat();
					 res = a * b;
					 System.out.print("Result = " + res);
				 }
				 case '4' -> {
					 System.out.print("Enter Two Number : ");
					 a = scan.nextFloat();
					 b = scan.nextFloat();
					 res = a / b;
					 System.out.print("Result = " + res);
				 }
				 case '5' -> System.exit(0);
				 default -> System.out.print("Wrong Choice!!!");
			 }
																	            System.out.print("\n---------------------------------------\n");
	}while(choice != 5);
    }
}
