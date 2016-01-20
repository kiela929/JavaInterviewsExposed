package com.JavaInterviewsExposed.chapter7;

import java.math.BigInteger;

/**
 * 
 * Code8
 * (���丮�� ����) 
 * @��������
 * n������ ��� �ڿ����� ���� ��.
 * BigInteger�� ����Ͽ� ���� ������ Ȯ����. 
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
