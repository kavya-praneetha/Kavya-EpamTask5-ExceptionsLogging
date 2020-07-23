package com.mithra.Cleancode;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Compound 
{	

	public static double Compound_interest(double principle_amt,double rate_of_interest,double time,double noof_times) throws IOException
    {
		
		double final_amt;
		
		final_amt=principle_amt*Math.pow((1+((rate_of_interest/100)/noof_times)),noof_times*time);
    	
    	return final_amt;
    }
}

