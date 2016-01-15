package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * code 7-1~2
 * (FizzBuzz 알고리즘 예시)
 * @로직설명
 * 1에서 n까지의 숫지를 출력하되 
 * 3의 배수는 Fizz라는 문자열을 출력하고, 
 * 5의 배수는 Bizz라는 문자열을 출력하고, 
 * 15의 배수는 FizzBuzz라는 문자열을 출력하는 알고리즘을 작성하라. 
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
	//추상화한 소스임. 
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
		System.out.println(fizzBuzz(30).toString());//그냥 일반적인 코드code7-1
		System.out.println(alternativeFizzBuzz(30).toString());//추상화 코드 code7-2
	}
}
