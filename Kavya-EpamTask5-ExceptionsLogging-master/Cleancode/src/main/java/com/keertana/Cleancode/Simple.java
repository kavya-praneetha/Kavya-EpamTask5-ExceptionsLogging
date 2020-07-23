package com.mithra.Cleancode;

import java.io.IOException;

public class Simple {
	public static double Simple_interest(double principle_amt,double rate_of_interest,double time) throws IOException
    {
		double final_amt;
    	final_amt=(principle_amt*(rate_of_interest)*time)/100;
    	return final_amt;
    }
}
