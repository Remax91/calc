/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maincalc.test;

import java.io.IOException;
import maincalc.Calc;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CalcTest {
    
    public CalcTest() {
    }
    //--------DATA PROVIDERS-----------------//
    @DataProvider
    public Object[][] InvokeAddMethodData() {
        return new Object[][] {
            { new Integer(20), new Integer(9), new Integer(11)},
            { new Integer (7), new Integer(4), new Integer(3)},
        };
    }
    @DataProvider
    public Object[][] InvokeSubMethodData() {
        return new Object[][] {
            { new Integer(25), new Integer(30), new Integer(5)},
            { new Integer (1), new Integer(4), new Integer(3)},
        };
    }
    @DataProvider
    public Object[][] InvokeDivMethodData() {
        return new Object[][] {
            { new Double(6), new Integer(30), new Integer(5)},
            { new Double (10), new Integer(40), new Integer(4)},
        };
    }
   //--------TESTS-----------------//
   Calc clc = new Calc();
   
   @Test(dataProvider = "InvokeAddMethodData")
   public void testAdd(int r, int a, int b){
       System.out.println("Testing Add method");
       assertEquals(r, clc.Plus(a, b));
   }
   
   @Test
   public void testAddingNegative(){
       System.out.println("Testing negative digits adding");
       assertEquals(-7,clc.Plus(-4, -3));
   }
    @Test(dataProvider = "InvokeSubMethodData")
   public void testSub(int r, int a, int b){
       System.out.println("Testing Sub method");
       assertEquals(r, clc.Sub(a, b));
   }
    @Test
   public void testSubNeagtive(){
       System.out.println("Testing negative sub method");
       assertEquals(-25, clc.Sub(-30, -5));
   }
   @Test(dataProvider = "InvokeDivMethodData")
   public void testDiv(Double r, int a, int b){
       System.out.println("Testing Div method");
       assertEquals(r, clc.Div(a, b));
   }
   @Test(expectedExceptions = ArithmeticException.class)
   public void testDivByZero(){
       System.out.println("Testing Divison by zero");
       assertEquals(9.0, clc.Div(81, 0));
   }
    @Test
   public void testMult(){
       System.out.println("Testing Mult method");
       assertEquals(27, clc.Mult(3, 9));
   }
    @Test
   public void testMultNegative(){
       System.out.println("Testing negative mult method");
       assertEquals(-27, clc.Mult(3, -9));
   }
    @Test
   public void testPow(){
       System.out.println("Testing Pow method");
       assertEquals(36.0, clc.Pow(6, 2));
   }
   @Test
   public void testPowInZero(){
       System.out.println("Testing pow in zero method");
       assertEquals(1.0, clc.Pow(6, 0));
   }
   @Test(expectedExceptions = IOException.class)
   public void testInvalidOperation() throws IOException{
       System.out.println("Testing Invalid Operation");
       clc.Calculation(5, 6, "=");
   }
   @Test
   public void testSqrt(){
       System.out.println("Testing sqrt method");
       assertEquals(5.0, clc.Sqrt(25));
   }
}



