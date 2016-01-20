package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Code 7-3~7-7
 * (�Ǻ���ġ����)
 * 
 * @��������
 * �� ���� ���� ���� ���� ���� ���� ���� �Ǵ� ���� ���.
 * n���� �־����� �� n������ �Ǻ���ġ ���� ����� ��ȯ�Ѵ�. 
 * n�� 0���� ũ�ų� ���ƾ� �Ѵ�. 
 * �Ű������� 0�� ��� �� ����Ʈ�� ��ȯ,
 * 1�� ��� 0�� ���� ����Ʈ ��ȯ,
 * 2��� 0��1�� ���� ����Ʈ�� ��ȯ�Ѵ�. 
 *
 */
public class Code3_7 {
	
	//Code7-3 
	//�Ǻ���ġ ������ ����Ʈ�� ��ȯ�ϴ� �޼��� 
	public static List<Integer> fibonacci(int n){
		if(n<0){//n�� 0���� Ŀ����
			throw new IllegalArgumentException("n must not be less than zero");
		}
		if(n==0){ //n�� 0�� ��� �� ����Ʈ ��ȯ
			return new ArrayList<>();
		}
		if(n==1){//n�� 1�ϰ�� 0�� ���� ����Ʈ ��ȯ
			return Arrays.asList(0);
		}
		if(n==2){//n�� 2�ϰ�� 0,1 ���� ����Ʈ ��ȯ
			return Arrays.asList(0,1);
		}
		
		
		final List<Integer> seq= new ArrayList<>(n);
		seq.add(0);
		n-=1;
		seq.add(1);
		n-=1;
		
		while(n>0){//�Ϲ����� �Ǻ���ġ ���� ���- ���� �� �� ���Ѱ��� ���� �߰��� �� 
			int a= seq.get(seq.size()-1);//���� �������� �ٷ� ���� ��
			int b= seq.get(seq.size()-2);//���� ������� �ι�° �� ��
			seq.add(a+b); //���� �μ��� �� ����
			n-=1;
		}
		return seq;
	}
	
	//Code7-5
	//n��° �Ǻ���ġ ���� ã�� �ڵ� 
	public static int fibN(int n){
		if(n<0){
			throw new IllegalArgumentException("n must not be less than zero");
		}
		if(n==1) return 1;
		if(n==0) return 0;
		return(fibN(n-1)+fibN(n-2)); //�̷��� �ϸ� ������� ������ ������ ��ȿ������ �ڵ���. ������ ����Լ��̱⶧��. 
	}

	
	//Code7-6
	//n��° �Ǻ���ġ ���� ã�� �ڵ� - fibN()�� �ð������� ������ �ڵ� 
	private static Map<Integer, Integer> fibCache= new HashMap<>();
	
	public static int cachedFibN(int n){
		if(n<0){
			throw new IllegalArgumentException("n must be less than zero");
		}
		fibCache.put(0, 0); //0(Ű)�� 0�� ����
		fibCache.put(1, 1);
		
		return recursiveCachedFibN(n);
	}
	
	private static int recursiveCachedFibN(int n){
		if(fibCache.containsKey(n)){
			return fibCache.get(n);
		}
		
		int value = recursiveCachedFibN(n-1)+ recursiveCachedFibN(n-2);
		fibCache.put(n, value);
		return value;
		
	}

}
