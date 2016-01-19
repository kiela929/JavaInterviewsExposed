package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		n=-1;
		seq.add(1);
		n=-1;
		
		while(n>0){//�Ϲ����� �Ǻ���ġ ���� ���- ���� �� �� ���Ѱ��� ���� �߰��� �� 
			int a= seq.get(seq.size()-1);
			int b= seq.get(seq.size()-2);
			seq.add(a+b);
			n=-1;
		}
		return seq;
	}

}
