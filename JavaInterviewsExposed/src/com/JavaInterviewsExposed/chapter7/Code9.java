package com.JavaInterviewsExposed.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Code 7-9
 * (애너그램 탐색기) 
 * @로직설명
 * 애너그램이란 단어의 철자를 재배열해서 다른 단어를 만드는 것.
 * 규칙은 글자를 삭제해서는 안되고, 멀리가져다 놓는 것을 가능하다는 것. 
 *  
 *
 */
public class Code9 {
	final Map<String,List<String>> lookup= new HashMap<>();
	
	public Code9(final List<String> words){ //생성자-> 단어를 lookup이라는 리스트에 저장.
		
		for(final String word: words){ //words는 리스트임. 리스트의 갯수만큼 for문을 돌리라는 것. 
			
			final String signature =alphabetize(word); //단어를 알파벳순서로 소팅하여 저장
			
			if(lookup.containsKey(signature)){ //이미 단어가 있을경우 
				lookup.get(signature).add(word);
			}else {
				final List<String> anagramList = new ArrayList<>();
				anagramList.add(word);
				lookup.put(signature, anagramList);
				
			}
		}
	}
	
	private String alphabetize(final String word){
		//단어를 저장하는 데 사용하는 서명을 생성하고 어떤 애너그램을 요청했을 때 이를 조회하는 용도로 사용한다. 
		//정렬알고리즘(sort함수)를 사용해서 알파벳순서로 정리하여 반환하면 그 것으로 list에서 조회하여 찾는다. 
		//이러한 알고리즘 덕분에 철자를 하나하나 비교하는 알고리즘에 비해서 확실하게 수행시간을 단축시킨다. 
		final byte[] bytes = word.getBytes();
		Arrays.sort(bytes); //byte를 얻어서 알파벳순으로 정렬 
		return new String(bytes);
		
	}
	
	public List<String> getAnagrams(final String word){
		final String signature = alphabetize(word);//조회하고자 하는 단어를 알파벳순서로 정리한다.
		final List<String> anagrams= lookup.get(signature);//정리한 단어를 list에 있는지 확인한다. 
		//이때 리스트에는 {알파벳순서로정리한 단어, 원본의 단어} 형태로 저장되어있다. 
		return anagrams==null? new ArrayList<String>():anagrams;
	}

}
