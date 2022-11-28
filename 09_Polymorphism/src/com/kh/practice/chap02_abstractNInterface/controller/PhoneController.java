package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		String[] result = new String[2];
		Phone[] phone = new Phone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for(int i = 0; i <phone.length; i++) {
			result[i] = ((SmartPhone)phone[i]).printInformation();
		}
		
		return result ;
	}
	
}
