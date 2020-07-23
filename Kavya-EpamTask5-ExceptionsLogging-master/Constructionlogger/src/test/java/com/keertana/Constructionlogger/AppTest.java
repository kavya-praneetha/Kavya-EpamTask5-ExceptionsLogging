package com.mithra.Constructionlogger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testApp()
    {
        Construction test=new Construction();
        double result=test.cost(3,450);
        assertEquals(result,810000.0);
    }
}
