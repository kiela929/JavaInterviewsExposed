package com.JavaInterviewsExposed.chapter7;
/**
 * 
 * Code 7-10 ~7-11
 * @��������
 * Q: ���ڿ��� ������ ���� �޼��带 �ۼ��϶�.
 * 
 */
public class Code10_11 {

	//Code 7-10
	public static String reverse(final String s){
		final StringBuilder builder = new StringBuilder(s.length());
		for(int i=s.length()-1;i>=0;i--){
			builder.append(s.charAt(i)); //������ ���ں��� �ϳ��� �ٿ������� ������ �ϼ�
		}
		
		return builder.toString();
	}
	
	//���� reserve�޼����� ���� ��뷮�� �޸𸮰� �ʿ��ϴٴ� ������ �ִ�. 
	//���������δ� �� String ��ü�� StringBuilder ��ü�� �޸𸮿� ������ �Ǵ� ������ �ܼ������� �Ⱑ����Ʈ ũ���� �����͸� ���������� ������ �� �� �ִ�. 
	//�׷��� ��ü String �ν��Ͻ��� StringBuilder ��ü�� �ε��� ���� ������ String��ü�� �������� �ȴ�. 
	//������ �� ���̴�. 
	
	//Code 7-11
	public static String inPlaceReverse(final String s){
		
		final StringBuilder builder2= new StringBuilder(s);
		
		for(int i=0; i<builder2.length()/2;i++){ //�̸� �ܾ builder�� �־���� �ڸ��� �ٲ��ִ°�.
			final char tmp = builder2.charAt(i);
			final int otherEnd=builder2.length()-i-1;
			builder2.setCharAt(i,builder2.charAt(otherEnd));
			builder2.setCharAt(otherEnd, tmp);
		}
		return builder2.toString();
	}
}
