package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;

	public int existMemberNum() {
//		for(int existMemberNum : m) {
//			
//		}
		return SIZE ;
	}
	
	public boolean checkId(String inputId) {
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		
	}
	
	public String searchId(String id) {
		
	}
	
	public Member[] searchName(String name) {
		
	}
	
	public Member[] searchEmail(String email) {
		
	}
	
	public boolean updatePassword(String id, String password) {
		
	}
	
	public boolean updateName(String id, String name) {
		
	}
	
	public boolean updateEmail(String id, String email) {
		
	}
	
	public boolean delete(String id) {
		
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		
	}
	
	
}
