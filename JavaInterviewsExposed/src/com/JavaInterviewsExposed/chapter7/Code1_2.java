package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * code 7-1~2
 * (FizzBuzz �˰��� ����)
 * @��������
 * 1���� n������ ������ ����ϵ� 
 * 3�� ����� Fizz��� ���ڿ��� ����ϰ�, 
 * 5�� ����� Bizz��� ���ڿ��� ����ϰ�, 
 * 15�� ����� FizzBuzz��� ���ڿ��� ����ϴ� �˰����� �ۼ��϶�. 
 */
public class Code1_2 {

	//Code7-1
	public static List<String> fizzBuzz(final int n){
		
		final List<String> toReturn=new ArrayList<>(n);
		
		for(int i=1; i<=n; i++){
			if(i%15==0){
				toReturn.add("FizzBuzz");
			}else if(i%5==0){
				toReturn.add("Bizz");
			}else if(i%3==0){
				toReturn.add("Fizz");
			}else{
				toReturn.add(Integer.toString(i));
			}
		}
		
		return toReturn;
	}
	
	//Code 7-2
	//�߻�ȭ�� �ҽ���. 
	public static List<String> alternativeFizzBuzz(final int n){
		final List<String> toReturn = new ArrayList<>(n);
		for(int i=1;i<=n;i++){
			final String word=toWord(3,i,"Fizz")+toWord(5,i,"Bizz");
			if(word.isEmpty()){
				toReturn.add(Integer.toString(i));
			}
			else{
				toReturn.add(word);
			}
	}
		return toReturn;
	}
	private static String toWord(final int divisor, final int value, final String word){
		return value%divisor==0?word:"";
	}
	
	
	
	
	////////////main
	public static void main(String[] args) {
		System.out.println(fizzBuzz(30).toString());//�׳� �Ϲ����� �ڵ�code7-1
		System.out.println(alternativeFizzBuzz(30).toString());//�߻�ȭ �ڵ� code7-2
	}
}
