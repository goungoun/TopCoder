package com.ganges.topcoder.traversal.versatile;

import java.util.Arrays;

public class InviteFriends {

	public int getMaxPeople(String first[], String second[]) {
		// TODO Auto-generated constructor stub
		System.out.println("first:"+Arrays.toString(first));
		System.out.println("seconds:"+Arrays.toString(second));

		int num_of_people=first.length;
		
		String invited[]=first;
		invited[0]="--";
		
		for (int i=0; i<num_of_people ;i++)
		{
			for (int j=0; j<num_of_people;j++)
			{
				if (i!=j && ( first[i].equals(first[j])||first[i].equals(second[j])||
					second[i].equals(first[j])||second[i].equals(second[j])))
				{
					invited[j]="--";
				}
			}
		}
		
		System.out.println("Invited:"+Arrays.toString(invited)+"\n");
		
		int num_of_invited=0;
		for(int i=0; i<invited.length;i++)
		{
			if (invited[i].equals("--")) num_of_invited++;
		}
		
		return num_of_invited;
	}
}
