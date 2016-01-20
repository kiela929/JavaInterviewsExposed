package com.JavaInterviewsExposed.chapter7;

import java.math.BigInteger;

/**
 * 
 * Code8
 * (팩토리얼 구현) 
 * @로직설명
 * n까지의 모든 자연수를 곱한 수.
 * BigInteger을 사용하여 수의 범위를 확장함. 
 */
public class Code8 {

	public static BigInteger factorial(int n){
		if(n<1){
			throw new IllegalArgumentException("n must be greater than zero");
		}
		BigInteger result = BigInteger.ONE;
		for(int i=1; i<=n; i++){
			result=result.multiply(BigInteger.valueOf(i));
		}
		
		return result;
	}
}
