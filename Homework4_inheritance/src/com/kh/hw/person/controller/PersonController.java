package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	//각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] personCount() {
		int[] arr = new int[2]; // 0 -> 현재 저장된 학생수,  1 -> 현재 저장된 사원수
		int count = 0;
		for(Student std : s) {
			if(std != null) {
				arr[0] = ++count;
			}
		}
		
		count = 0;
		for(Employee emp : e) {
			if(emp != null) {
				arr[1] = ++count;
			}
		}
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break; // 한번이라도 수행되면 종료시켜줘야하므로 break문 입력해줘야함
			}
		}
	}
	
	public Student[] printStudent(){
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break; // 한번이라도 수행되면 종료시켜줘야하므로 break문 입력해줘야함
			}
		}

	}
	
	public Employee[] printEmployee() {
		return e;
	}
	

}
