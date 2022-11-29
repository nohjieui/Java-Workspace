package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	// 매개변수로 받아온 str을 StringTokenizer를 이용하여
	// 띄어쓰기를 없애고 없앤 문자열 반환
	public String afterToken(String str) {
		String result = "";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		return result;
	}
	
	// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		int result = 0;
		char[] arr = input.toCharArray();
		return result;
	}
	
	// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	public int findChar(String input, char one) {
		int result = 0;
		char[] arr = input.toCharArray(); //문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		for(char c : arr) {
			if(c == one) {
				result++;
			}
		}
		return result;
	}
	
}
