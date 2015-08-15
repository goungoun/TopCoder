package com.ganges.topcoder.traversal.versatile;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class InviteFriendsTest {
	@Test
	public void test() {
		String first[]={"fishing","gardening","swimming","fishing"};
		String second[]={"hunting","fishing","fishing","biting"};
		
		InviteFriends ifs=new InviteFriends();
		assertEquals(4,ifs.getMaxPeople(first, second));
	}
	
	@Test
	public void test_1() {
		String first[]={"variety","diversity","loquacity","courtesy"};
		String second[]={"talking","speaking","discussion","meeting"};
		
		InviteFriends ifs=new InviteFriends();
		assertEquals(1,ifs.getMaxPeople(first, second));
	}
	
	@Test
	public void test_2() {
		String first[]={"snakes","programming","cobra","monty"};
		String second[]={"python","python","anaconda","python"};
		
		InviteFriends ifs=new InviteFriends();
		assertEquals(3,ifs.getMaxPeople(first, second));
	}
}
