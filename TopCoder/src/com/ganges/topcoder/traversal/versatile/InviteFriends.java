package com.ganges.topcoder.traversal.versatile;

import java.util.Arrays;
import java.util.HashMap;

public class InviteFriends {

	public int getMaxPeople(String first[], String second[]) {
		System.out.println("first:"+Arrays.toString(first));
		System.out.println("seconds:"+Arrays.toString(second));

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		int num_people=first.length;
		
		for (int i=0; i<num_people ;i++)
		{
			hm.put(first[i],0);
			hm.put(second[i],0);
		}
		
		for (int i=0; i<num_people ;i++)
		{
			hm.put(first[i],hm.get(first[i])+1);
			hm.put(second[i],hm.get(second[i])+1);
		}
		
		int max_value =0;
		for (String key:hm.keySet())
		{
			max_value=Math.max(max_value, hm.get(key));
		}
		
		System.out.println("hm"+hm.toString()+"\n");
		
		return max_value;
	}
}
