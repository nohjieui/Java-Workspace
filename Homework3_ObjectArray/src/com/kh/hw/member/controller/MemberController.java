package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;

	public int existMemberNum() {
		int count = 0;
		for(Member member : m) {
			if(member != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(Member member : m) {
			if(member != null && member.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
	}
	
	public String searchId(String id) {
		
	}
	
	public Member[] searchName(String name) {
		
	}
	
	public Member[] searchEmail(String email) {
		
	}
	
	public boolean updatePassword(String id, String password) {
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setPassword(password);
			}
		}
	}
	
	public boolean updateName(String id, String name) {
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setName(name);
			}
		}
	}
	
	public boolean updateEmail(String id, String email) {
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setEmail(email);
			}
		}
	}
	
	public boolean delete(String id) {
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member = null;
			}
		}
	}
	
	public void delete() {
		m = new Member[SIZE];
	}
	
	public Member[] printAll() {
		return m;
	}
	
}
