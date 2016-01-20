package com.JavaInterviewsExposed.chapter7;
/**
 * 
 * Code 7-10 ~7-11
 * @로직설명
 * Q: 문자열을 뒤집기 위한 메서드를 작성하라.
 * 
 */
public class Code10_11 {

	//Code 7-10
	public static String reverse(final String s){
		final StringBuilder builder = new StringBuilder(s.length());
		for(int i=s.length()-1;i>=0;i--){
			builder.append(s.charAt(i)); //마지막 글자부터 하나씩 붙여나가서 뒤집기 완성
		}
		
		return builder.toString();
	}
	
	//위의 reserve메서드의 경우는 대용량의 메모리가 필요하다는 문제가 있다. 
	//구조상으로는 원 String 객체와 StringBuilder 객체만 메모리에 있으면 되는 구조라 단순하지만 기가바이트 크기의 데이터를 뒤집으려면 문제가 될 수 있다. 
	//그래서 전체 String 인스턴스를 StringBuilder 객체로 로딩해 원래 순서의 String객체를 뒤집으면 된다. 
	//다음이 그 예이다. 
	
	//Code 7-11
	public static String inPlaceReverse(final String s){
		
		final StringBuilder builder2= new StringBuilder(s);
		
		for(int i=0; i<builder2.length()/2;i++){ //미리 단어를 builder에 넣어놓고 자리를 바꿔주는것.
			final char tmp = builder2.charAt(i);
			final int otherEnd=builder2.length()-i-1;
			builder2.setCharAt(i,builder2.charAt(otherEnd));
			builder2.setCharAt(otherEnd, tmp);
		}
		return builder2.toString();
	}
}
