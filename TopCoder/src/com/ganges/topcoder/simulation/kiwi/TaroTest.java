package com.ganges.topcoder.simulation.kiwi;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class TaroTest {

	@Test
	public void test() {
		Taro taro = new Taro();
		
		// input
		int[] capacities={20,20};
		int[] bottles={5,8};
		int[] fromID={0};
		int[] toID={1};
		
		// output
		int[] result={0,13};
		
		Assert.assertArrayEquals(taro.PourJuice(capacities, bottles, fromID, toID), result);
	}

	@Test
	public void test_1() {
		Taro taro = new Taro();
		
		// input
		int[] capacities={10,10};
		int[] bottles={5,8};
		int[] fromID={0};
		int[] toID={1};
		
		// output
		int[] result={3,10};
		
		Assert.assertArrayEquals(taro.PourJuice(capacities, bottles, fromID, toID), result);
	}
	
	@Test
	public void test_2() {
		Taro taro = new Taro();
		
		// input
		int[] capacities={30,20,10};
		int[] bottles={10,5,5};
		int[] fromID={0,1,2};
		int[] toID={1,2,0};
		
		// output
		int[] result={10,10,0};
		
		Assert.assertArrayEquals(taro.PourJuice(capacities, bottles, fromID, toID), result);
	}
	
	@Test
	public void test_3() {
		Taro taro = new Taro();
		
		// input
		int[] capacities={14,35,86,58,25,62};
		int[] bottles={6,34,27,38,9,60};
		int[] fromID={1,2,4,5,3,3,1,0};
		int[] toID={0,1,2,4,2,5,3,1};
		
		// output
		int[] result={0,14,65,35,25,35};
		
		Assert.assertArrayEquals(taro.PourJuice(capacities, bottles, fromID, toID), result);
	}
	
	@Test
	public void test_4() {
		Taro taro = new Taro();
		
		// input
		int[] capacities={700000,800000,900000,1000000};
		int[] bottles={478478,478478,478478,478478};
		int[] fromID={2,3,2,0,1};
		int[] toID={0,1,1,3,2};
		
		// output
		int[] my_result=taro.PourJuice(capacities, bottles, fromID, toID);
		int[] result={0,156956,900000,856956};
		
		System.out.println("my_result: "+Arrays.toString(my_result));
		System.out.println("result   : "+Arrays.toString(result));
		
		Assert.assertArrayEquals(my_result, result);
	}
}
