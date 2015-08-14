package com.ganges.topcoder.simulation.kiwi;

import java.util.Arrays;

public class Taro {

	public int[] PourJuice(int[] capacities,int[] bottles, int[] fromID, int[] toID)
	{
		for (int i=0; i < fromID.length; i++)
		{	
			int from=fromID[i];
			int to=toID[i];
			
			if (capacities[to] >= bottles[to]+bottles[from])
			{
				bottles[to]=bottles[to]+bottles[from];
				bottles[from]=0;
			} else
			{
				bottles[from]=bottles[to]+bottles[from]-capacities[to];
				bottles[to]=capacities[to];
			}
		}
		return bottles;
	}
}
