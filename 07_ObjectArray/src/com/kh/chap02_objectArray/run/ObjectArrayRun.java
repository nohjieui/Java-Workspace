package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone();// 기본 생성자 호출해 값을 초기화 시킴 
		arr[0].setName("아이폰"); // -> arr의 0번 인덱스에 접근하게되면 Phone 객체에 접근하게 될 수 있으므로 .setXXX을 실행 시킬 수 있다.
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		
		arr[1] = new Phone("아이폰", "13", "애플", 1500000); //arr의 1번 인덱스에 접근 해 Phone객체의 매개변수가 있는 생성자를 호출해 초기화와 동시에 주소값을 저장 
		
		arr[2] = new Phone("갤럭시", "zplip4", "삼성", 1350000);
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].infomation());
			sum += arr[i].getPrice();
		}
		
		System.out.println("총 가격 : "+ sum + "원");
		System.out.println("평균 가격 : " + (sum / arr.length) +"원");
		
	}

}
