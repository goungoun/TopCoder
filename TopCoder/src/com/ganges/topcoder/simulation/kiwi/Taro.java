package com.ganges.topcoder.simulation.kiwi;

import java.util.Arrays;

public class Taro {

	public int[] PourJuice(int[] capacities,int[] bottles, int[] fromID, int[] toID)
	{
		for (int i=0; i < fromID.length; i++)
		{	
			int from=fromID[i];
			int to=toID[i];
			int sum=bottles[to]+bottles[from];
			
			bottles[to]=Math.min(sum,capacities[to]);
			bottles[from]=sum-bottles[to];
		}
		return bottles;
	}
}
