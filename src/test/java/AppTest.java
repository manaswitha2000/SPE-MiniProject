import org.junit.*;

import static org.junit.Assert.*;

public class AppTest{
    @BeforeClass
    public static void before_test() {
        System.out.println("starting all test");
    }

    @Test
    public void sqroot() {
        System.out.println("test 1) Finding square root of numbers");
        assertEquals("Square root of 100 is not working correctly",10, Calculator.sqrt(100f),0.00001);
        assertEquals("Square root of 10 is not working correctly",3.16227, Calculator.sqrt(10f),0.00001);
        assertEquals("Square root of 0 is not working correctly",0, Calculator.sqrt(0f),0.00001);
    }

    @Test
    public void fact() {
        System.out.println("test 2) Finding factorial numbers");
        assertEquals("Factorial of 5 is not working correctly",120, Calculator.factorial(5f),0.00001);
        assertEquals("Factorial of 3 is not working correctly",6, Calculator.factorial(3f),0.00001);
        assertEquals("Factorial of 0 is not working correctly",1, Calculator.factorial(0f),0.00001);
    }

    @Test
    public void nlog() {
        System.out.println("test 2) Finding factorial numbers");
        assertEquals("Natural log of 10 is not working correctly",2.30258512496, Calculator.log(10f),0.00001);
        assertEquals("Natural log of 4 is not working correctly",1.38629436112, Calculator.log(4f),0.00001);
        assertEquals("Natural log of 0 is not working correctly",0, Calculator.log(1f),0.00001);
    }

    @Test
    public void powerfunc() {
        System.out.println("test 2) Finding factorial numbers");
        assertEquals("10 to the power of 2 is not working correctly",100, Calculator.power(10f, 2f),0.00001);
        assertEquals("10 to the power of 2 is not working correctly",32, Calculator.power(2f, 5f),0.00001);
        assertEquals("10 to the power of 2 is not working correctly",1, Calculator.power(1f, 100f),0.00001);
    }



}
