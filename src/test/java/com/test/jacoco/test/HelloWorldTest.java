package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(6,1,1);
    	int c = hw.Method3(6,1,-3);
    	int d = hw.Method3(2,1,1);
    	int e = hw.Method3(2,-1,-3);
    	int f = hw.Method3(2,1,-1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 1, 2, 3, 4.0f);
        int b = hw.Method4(1, 1, 2, 6, 4.0f);
        int c = hw.Method4(5, 3, 2, 2, 4.0f);
        //int d = hw.Method4(1, 3, 2, 2, 4.0f);
        //int e = hw.Method4(1, 3, 1, 2, 4.0f);
    }

    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        assertEquals(false,hw.isTriangle(-3,4,5));
        assertEquals(false,hw.isTriangle(3,-4,5));
        assertEquals(false,hw.isTriangle(3,4,-5));
        assertEquals(false,hw.isTriangle(1,1,5));
        assertEquals(false,hw.isTriangle(6,2,3));
        assertEquals(false,hw.isTriangle(3,15,9));
        assertEquals(true,hw.isTriangle(3,4,5));
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        assertEquals(false,hw.isBirthday(1029,5,1));
        assertEquals(false,hw.isBirthday(2020,5,1));
        assertEquals(false,hw.isBirthday(1999,12,1));
        assertEquals(false,hw.isBirthday(1999,0,1));
        assertEquals(false,hw.isBirthday(1999,5,2));
        assertEquals(true,hw.isBirthday(1999,5,1));
    }

    @Test
    public void testminiCalculater(){
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(6.0,1.2,'+');
        assertEquals((Double)7.2,(Double)a);
        double b = hw.miniCalculator(6.0,1.2,'-');
        assertEquals((Double)4.8,(Double)b);
        double c = hw.miniCalculator(5.0,1.2,'*');
        assertEquals((Double)6.0,(Double)c);
        double d = hw.miniCalculator(6.0,1.2,'/');
        assertEquals((Double)5.0,(Double)d);
        double e = hw.miniCalculator(6.0,0.0,'/');
        assertEquals((Double)0.0,(Double)e);
        double f = hw.miniCalculator(6.0,1.2,'0');
        assertEquals((Double)0.0,(Double)f);
    }
}
