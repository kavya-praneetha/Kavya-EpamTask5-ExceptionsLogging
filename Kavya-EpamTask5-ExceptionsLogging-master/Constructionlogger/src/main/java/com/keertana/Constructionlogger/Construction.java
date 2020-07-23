package com.mithra.Constructionlogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface cons
{
	public double cost (int choice, double Area_of_house );
}

public class Construction implements cons
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public double cost(int choice, double Area_of_house) 
	{
		double cost = 0;
		switch(choice)
		{
		case 1:
			cost=Area_of_house*1200;
		case 2 :
			cost=Area_of_house*1500;
		case 3:
			cost=Area_of_house*1800;
		case 4:
			cost=Area_of_house*2500;
		default :
			LOGGER.error("Due to incorrect choice program terminated");
		}
		return cost;
	}
}

