package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	// 매개변수로 받아온 str을 StringTokenizer를 이용하여
	// 띄어쓰기를 없애고 없앤 문자열 반환
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String result = "";
		// 방법1. String클래스 이용
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken();
//		}
//		return result;
		
		// 방법2. StringBuffer or StringBuilder를 이용
		StringBuilder sb = new StringBuilder();
		
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		return sb.toString();
	}
	
	// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		
		String upper = input.substring(0, 1).toUpperCase(); // 0이상 1미만의 인덱스 범위를 짤라옴. 그 후 대문자 변환
		
		return upper + input.substring(1); // 대문자로 변환한 문자 + 0번 인덱스를 제외한 문자열을 합쳐서 반환
	}
	
	// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	public int findChar(String input, char one) {
		int count = 0; // 문자열 안에 문자가 몇개 들어가있는지 세어줄 변수 선언
		
		// 방법 1. charAt 활용
//		for(int i = 0; i<input.length(); i++){
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		
		// 방법 2. toCharArray 활용
		char[] arr = input.toCharArray(); //문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		for(char c : arr) {
			if(c == one) {
				count++;
			}
		}
		return count;
	}
	
}
