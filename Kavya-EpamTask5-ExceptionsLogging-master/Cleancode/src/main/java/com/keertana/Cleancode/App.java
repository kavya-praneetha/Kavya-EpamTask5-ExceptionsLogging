package com.mithra.Cleancode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) throws IOException
    {
        Simple test= new Simple();
        Scanner in=new Scanner(System.in);
        double noof_times,principle_amt,rate_of_interest,time;
        noof_times=in.nextDouble();
        principle_amt=in.nextDouble();
        rate_of_interest=in.nextDouble();
        if(rate_of_interest==0)
		{
			LOGGER.error("Arithmetic Exception found \n Program Terminated");
			return;
		}
        time=in.nextDouble();
        double Sfinal_amt=test.Simple_interest(principle_amt,rate_of_interest,time);
        Compound test1= new Compound();
        double Cfinal_amt=test1.Compound_interest(principle_amt,rate_of_interest,time,noof_times);
    }
    
}
