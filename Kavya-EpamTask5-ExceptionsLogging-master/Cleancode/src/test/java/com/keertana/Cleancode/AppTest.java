package com.divya.Cleancode;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest 
    extends TestCase
{

    public void testApp() throws IOException
    {
    	Compound test = new Compound();
    	Simple simple =new Simple();
        Double Compound_result=test.Compound_interest(1500, 4.3, 6, 4);
        assertEquals(Compound_result,1938.8368221341054);
        Double Simple_result=simple.Simple_interest(50000, 8, 1);
        assertEquals(Simple_result,4000.0);
    }
}
