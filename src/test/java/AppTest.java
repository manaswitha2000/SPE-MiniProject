import org.junit.*;

import static org.junit.Assert.*;

public class AppTest{
    @BeforeClass
    public static void before_test() {
        System.out.println("starting addition test");
    }

    @Test
    public void positive_and_positive() {
        System.out.println("test 1) Adding +ve and +ve integer numbers");
        assertEquals("addition of 3.5 and 1.5 is not working correctly",5, Calculator.add(3.5f, 1.5f),0.00001);
    }

    @Test
    public void positive_and_negative() {
        System.out.println("test 2) Adding +ve and -ve integer numbers");
        assertEquals("addition of 6.5 and -1.5 is not working correctly",5, Calculator.add(6.5f, -1.5f),0.00001);
    }

    @Test
    public void negative_and_negative() {
        System.out.println("test 3) Adding -ve and -ve integer numbers");
        assertEquals("addition of -6.5 and -1.5 is not working correctly",-8, Calculator.add(-6.5f, -1.5f),0.00001);
    }


}
