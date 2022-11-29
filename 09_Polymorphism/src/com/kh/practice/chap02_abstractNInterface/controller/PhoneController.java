package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
//		String[] result = new String[2];
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		int count = 0;
		for(Phone p :phones) {
			if(p instanceof V40) {
				result[count++] = ((V40) p).printInformation();
			} else {
				result[count++] = ((GalaxyNote9) p).printInformation();
			}
		}
//		for(int i = 0; i <phones.length; i++) {
//			result[i] = ((SmartPhone)phones[i]).printInformation();
//		}
		
		return result ;
	}
	
}
