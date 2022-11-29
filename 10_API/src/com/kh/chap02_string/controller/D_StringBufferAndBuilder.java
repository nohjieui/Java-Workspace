package com.kh.chap02_string.controller;

public class D_StringBufferAndBuilder {
	/*
	 * String은 불변 클래스,
	 * StringBuffer와 StringBuilder는 mutable클래스
	 * 
	 * 문자열 연산이 빈번하게 일어나는 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
	 * 
	 * 기본적으로 두개의 클래스는 동일한 메소드를 지니며 차이점은 동기화(쓰레드safe)여부.
	 * 
	 * StringBuffer는  멀티 스레드 환경에서 유용하며
	 * StringBuilder는 단일 스레드 환경에서 유용함.
	 */
	
	public void method() {
		String str = "hello";
		str += "World";
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("World,");
		
		StringBuilder sb2 = new StringBuilder("hello");
		sb2.append("World");
		
//		System.out.println(str);
		
		System.out.println(sb);
		
		System.out.println(sb2);
		
		System.out.println("sb의 길이는 ? : "+sb.length());
		
		System.out.println("o의 마지막 위치는 ? : "+sb.lastIndexOf("o"));
		//String fileName = "TEST.txt" 파일의 이름과 확장자를 찾을때 sb.lastIndexOf(".") 사용해 .을 기준으로 찾을 수 있음
		
		// 마지막위치의 문자를 없애는 메서드
		// 마지막위치 -> 문자열의 길이 -1
		// sb.deleteCharAt(인덱스);
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb); // , 가 제거된 채로 출력됨
		
		// 내가 원하는 위치의 인덱스부터 내가 정한 마지막 인덱스까지 삭제
		// 시작 인덱스 <= 인덱스범위 <= 종료인덱스
		System.out.println(sb.delete(0, sb.length()));
		
		System.out.println(sb);
		
	}
	

}
