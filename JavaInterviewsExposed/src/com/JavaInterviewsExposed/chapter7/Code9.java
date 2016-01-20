package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Code 7-9
 * (�ֳʱ׷� Ž����) 
 * @��������
 * �ֳʱ׷��̶� �ܾ��� ö�ڸ� ��迭�ؼ� �ٸ� �ܾ ����� ��.
 * ��Ģ�� ���ڸ� �����ؼ��� �ȵǰ�, �ָ������� ���� ���� �����ϴٴ� ��. 
 *  
 *
 */
public class Code9 {
	final Map<String,List<String>> lookup= new HashMap<>();
	
	public Code9(final List<String> words){ //������-> �ܾ lookup�̶�� ����Ʈ�� ����.
		
		for(final String word: words){ //words�� ����Ʈ��. ����Ʈ�� ������ŭ for���� ������� ��. 
			
			final String signature =alphabetize(word); //�ܾ ���ĺ������� �����Ͽ� ����
			
			if(lookup.containsKey(signature)){ //�̹� �ܾ ������� 
				lookup.get(signature).add(word);
			}else {
				final List<String> anagramList = new ArrayList<>();
				anagramList.add(word);
				lookup.put(signature, anagramList);
				
			}
		}
	}
	
	private String alphabetize(final String word){
		//�ܾ �����ϴ� �� ����ϴ� ������ �����ϰ� � �ֳʱ׷��� ��û���� �� �̸� ��ȸ�ϴ� �뵵�� ����Ѵ�. 
		//���ľ˰���(sort�Լ�)�� ����ؼ� ���ĺ������� �����Ͽ� ��ȯ�ϸ� �� ������ list���� ��ȸ�Ͽ� ã�´�. 
		//�̷��� �˰��� ���п� ö�ڸ� �ϳ��ϳ� ���ϴ� �˰��� ���ؼ� Ȯ���ϰ� ����ð��� �����Ų��. 
		final byte[] bytes = word.getBytes();
		Arrays.sort(bytes); //byte�� �� ���ĺ������� ���� 
		return new String(bytes);
		
	}
	
	public List<String> getAnagrams(final String word){
		final String signature = alphabetize(word);//��ȸ�ϰ��� �ϴ� �ܾ ���ĺ������� �����Ѵ�.
		final List<String> anagrams= lookup.get(signature);//������ �ܾ list�� �ִ��� Ȯ���Ѵ�. 
		//�̶� ����Ʈ���� {���ĺ������������� �ܾ�, ������ �ܾ�} ���·� ����Ǿ��ִ�. 
		return anagrams==null? new ArrayList<String>():anagrams;
	}

}
