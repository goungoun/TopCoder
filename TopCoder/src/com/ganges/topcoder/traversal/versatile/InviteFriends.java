package com.ganges.topcoder.traversal.versatile;

import java.util.Arrays;
import java.util.HashMap;

//Anything in common. (It should be something in common)
public class InviteFriends {

	public int getMaxPeople(String first[], String second[]) {
		System.out.println("first:"+Arrays.toString(first));
		System.out.println("seconds:"+Arrays.toString(second));

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		int cnt=0;
		int max_value =0;
		
		for (int i=0; i<first.length ;i++)
		{
			cnt=hm.get(first[i])==null?1:hm.get(first[i])+1;
			hm.put(first[i],cnt);
			max_value=Math.max(max_value, cnt);
		}
		
		for (int i=0; i<second.length ;i++)
		{
			cnt=hm.get(second[i])==null?1:hm.get(second[i])+1;
			hm.put(second[i],cnt);
			max_value=Math.max(max_value, cnt);
		}
		
		System.out.println("hm"+hm.toString()+"\n");
		
		return max_value;
	}
}
