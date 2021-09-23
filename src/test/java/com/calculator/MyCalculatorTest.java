package com.calculator;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class MyCalculatorTest extends TestCase {

    private MyCalculator myCalculator = new MyCalculator();

    // The method can take up to two numbers, separated by commas, and will return their sum.
    public void testAddition(){
        String numbers = "12,14,5";
        int addition =
                myCalculator.addCalculator(numbers);
        assertEquals(31, addition);
    }
    @Test
    public void testWithUnkownAmountOfNumbers() throws Exception{

        int addition = myCalculator.additionCalculator("1,2,3,4");
        assertEquals(10, addition);
    }
    @Test
    public void testSupportDifferentDelimiters() throws Exception{

        int addition = myCalculator.additionCalculator("//;\n1;2");
        Assert.assertEquals(3, addition);
    }
    @Test
    public void testNewLineBetweenNumber() throws Exception{
        int addition = myCalculator.additionCalculator("3\n4,5");
        Assert.assertEquals(12, addition);
    }
        @Test
    public void testWithNegativeNumber() throws Exception{

        int addition= myCalculator.additionCalculator("1,2,-5,5,-8");
        Assert.assertEquals(3, addition);
    }

}
