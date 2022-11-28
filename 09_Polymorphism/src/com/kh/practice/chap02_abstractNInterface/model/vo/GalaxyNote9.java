package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class GalaxyNote9 extends SmartPhone implements NotePen {
	
	public GalaxyNote9() {
		setMaker("삼성");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1300만 듀얼카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		System.out.println("블루투스 펜 탑재 여부 : ");
		return true;
	}
	
	public String printInformation() {
		return makeCall() + takeCall() + picture() + charge() + touch()+ bluetoothPen();
	}
	

}
