package com.kh.chap01_beforeVsafter.befofe.run;

import com.kh.chap01_beforeVsafter.befofe.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// Desktop 객체
		// brand , pCode , pName. price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "삼성데스크탑", 1_500_000, true);
		
		// SmartePhone 객체
		// brand , pCode , pName. price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰14", 1_400_000, "SKT");
		
		// Tv 객체
		// brand , pCode , pName. price, inch
		Tv t = new Tv("엘지", "p-01", "얇은티비", 3_500_000, 60);
		
		System.out.println(d.infomation());
		System.out.println(s.infomation());
		System.out.println(t.infomation());
		
		/*
		 * 매 클래스마다 중복된 코드들을 일일이 기술해두게 되면
		 * 수정과 같은 유지보수시 매번 일일이 찾아서 수정해야하는 번거로움이 생김
		 * ex) 필드명 수정, 새로운 필드 추가시
		 * 
		 * 상속이라는 개념을 적용시켜서 매 클래스마다 "중복된" 필드, 메소드들을
		 * 단 한번 또하나의 클래스(부모클래스)에 정의해둔후
		 * 해당클래스를 상속받아서 부모클래스의 필드와 메소드를 가져다쓰는 방식으로
		 * 코드의 중복의 피해야한다.
		 */
	}

}
