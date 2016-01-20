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
	public void fibonacciList(){//�Ǻ���ġ ���� ����Ʈ�� �����ϴ��� Test
		
		assertEquals(0,Code3_7.fibonacci(0).size());//n=0�̸� �� ����Ʈ ��ȯ�̹Ƿ� size�� 0��
		assertEquals(Arrays.asList(0),Code3_7.fibonacci(1));//n=1�̸� ��ȯ�� 0��.
		assertEquals(Arrays.asList(0,1),Code3_7.fibonacci(2));//n=2�̸� ��ȯ�� 0,1��
		assertEquals(Arrays.asList(0,1,1),Code3_7.fibonacci(3));//n=3�̸� 0,1,0+1
		assertEquals(Arrays.asList(0,1,1,2),Code3_7.fibonacci(4));
		assertEquals(Arrays.asList(0,1,1,2,3),Code3_7.fibonacci(5));
	}

	@Test 
	public void largeFib(){ // Code 7-5�� Code7-6�� ����ð� �����ϴ� �׽�Ʈ 
		final long nonCachedStart = System.nanoTime();
		assertEquals(1134903170,Code3_7.fibN(45));
		final long nonCachedFinish = System.nanoTime();
		assertEquals(1134903170,Code3_7.cachedFibN(45));
		final long cachedFinish = System.nanoTime();
		
		System.out.printf("Non cached time: %d nanoseconds%n",nonCachedFinish-nonCachedStart);
		System.out.printf("Cached time: %d nanoseconds%n",cachedFinish-nonCachedFinish);
		
	}
}
