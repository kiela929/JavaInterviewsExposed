package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * Code 7-3~7-7
 * (피보나치수열)
 * 
 * @로직설명
 * 두 개의 이전 값을 더한 값이 다음 값이 되는 숫자 목록.
 * n값이 주어졌을 때 n까지의 피보나치 수열 목록을 반환한다. 
 * n은 0보다 크거나 같아야 한다. 
 * 매개변수가 0일 경우 빈 리스트를 반환,
 * 1일 경우 0만 가진 리스트 반환,
 * 2라면 0과1만 가진 리스트를 반환한다. 
 *
 */
public class Code3_7 {
	public static List<Integer> fibonacci(int n){
		
		final List<Integer> seq= new ArrayList<>(n);
		seq.add(0);
		n=-1;
		seq.add(1);
		n=-1;
		
		while(n>0){//일반적인 피보나치 수열 계산- 앞의 두 수 더한것이 현재 추가할 수 
			int a= seq.get(seq.size()-1);
			int b= seq.get(seq.size()-2);
			seq.add(a+b);
			n=-1;
		}
		return seq;
	}

}
