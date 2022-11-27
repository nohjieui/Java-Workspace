package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

// 다형성을 적용시켰을 때
public class ElectronicController2 {

	private Electronic[] elec = new Electronic[3];
	
	// Electronic any : 데스크탑, 노트북, 테블릿을 담을 수 있는 다형성이 적용된 매개변수
	// int index      : elec배열의 index위치에 any변수를 넣기위한 매개변수
	public void insert(Electronic any, int index) {
		elec[index] = any;
	}
	
	// Electronic 배열안에 어떤 데이터가 있는지 반환해주는 select 메소드 생성
	public Electronic select(int index) {
		return elec[index];
	}
	
	public Electronic[] select() {
		return elec;
	}
	
}
