package testSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LearnJunitTags {
    @Before
    public void beforeMethod()
    {
        System.out.println("Before method");
    }
    @Test
    public void Test1()
    {
        System.out.println("Test case 1");
    }
   @Test
    public void Test2()
    {
        System.out.println("Test case 2");
    }
    @Test
    public void Test3()
    {
        System.out.println("Test case 3");
    }
    @After
    public void afterMethod(){
        System.out.println("After method");
    }
}
