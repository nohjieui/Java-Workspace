package com.kh.chap03_class.run;

import com.kh.chap03_class.medel.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setpName("아이폰 14");
		p1.setPrice(1400000);
		//p1.setBrand("애플"); // brand필드에 "애플"로 값이 이미 초기화 되어 있어서, brand명시형이 애플 상품이라면 초기화하지 않아도됨.
		
		System.out.println(p1.infomation());
		
		Product p2 = new Product();
		p2.setpName("갤럭시 z플립4");
		p2.setPrice(1350000);
		p2.setBrand("삼성");
		
		System.out.println(p2.infomation());
		
		
		Member m1 = new Member();
		m1.changeName("노지의");
		m1.printName();

	}

}
