package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
	public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	
	String makeCall(); //전화 거는 추상메소드
	
	String takeCall(); // 전화 받는 추상메소드

}
