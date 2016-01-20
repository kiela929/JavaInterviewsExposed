package com.JavaInterviewsExposed.UnitTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import junit.extensions.TestSetup;
import junit.framework.TestSuite;

import org.junit.Test;

import com.JavaInterviewsExposed.chapter7.Code3_7;

public class Chpater7 {

	//Code3_7 code=new Code3_7();

	
	@Test
	public void fibonacciList(){//피보나치 수열 리스트를 리턴하는지 Test
		
		assertEquals(0,Code3_7.fibonacci(0).size());//n=0이면 빈 리스트 반환이므로 size가 0임
		assertEquals(Arrays.asList(0),Code3_7.fibonacci(1));//n=1이면 반환은 0임.
		assertEquals(Arrays.asList(0,1),Code3_7.fibonacci(2));//n=2이면 반환은 0,1임
		assertEquals(Arrays.asList(0,1,1),Code3_7.fibonacci(3));//n=3이면 0,1,0+1
		assertEquals(Arrays.asList(0,1,1,2),Code3_7.fibonacci(4));
		assertEquals(Arrays.asList(0,1,1,2,3),Code3_7.fibonacci(5));
	}

	@Test 
	public void largeFib(){ // Code 7-5와 Code7-6의 수행시간 측정하는 테스트 
		final long nonCachedStart = System.nanoTime();
		assertEquals(1134903170,Code3_7.fibN(45));
		final long nonCachedFinish = System.nanoTime();
		assertEquals(1134903170,Code3_7.cachedFibN(45));
		final long cachedFinish = System.nanoTime();
		
		System.out.printf("Non cached time: %d nanoseconds%n",nonCachedFinish-nonCachedStart);
		System.out.printf("Cached time: %d nanoseconds%n",cachedFinish-nonCachedFinish);
		
	}
}
