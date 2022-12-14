package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * 메소드
	 * [표현법]
	 * 접근제한자 예약어(생략가능) 반환할값의자료형 메소드명([매개변수]){
	 *      수행할코드;
	 *      
	 *      return 반환할값; (반환형이 void일경우 생략가능)
	 * }
	 * 
	 * 메소드를 정의한 후 항상 원하는만큼 호출해서 사용할 수 있음.
	 */
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		// return; JVM이 자동으로 생성해줌. void 메소드만!!
	}
	
	// 2. 매개변수가 없고, 반환값은 있는 메소드
	public int method2() {
		
		System.out.println("매개변수가 없고 반환값은 있는 메소드입니다.");
		
		// 1부터 100까지의 랜덤값을 발생시키고, 돌려주는 메소드
		// int random = (int) (Math.random()*100+1); 변수는 값을 담아두고 재사용할 목적이기때문에 재사용할 일이 없을경우는 변수 생성 x
		
		return (int) (Math.random()*100+1);
	}
	
	// 3. 매개변수가 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고 반환값은 없는 메소드입니다.");
		
		// num1과 num2의 값을 비교하여, 결과를 출력하는 메소드
		// 최소값 : xx
		// 최대값 : xx
		
		int min = 0; // 두 수중에 작은값을 보관
		int max = 0; // 두 수중에 큰값을 보관
		
		if(num1 > num2) {
			min = num2;
			max = num1;
		} else {
			min = num1;
			max = num2;
		}
		
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		
	}
	
	// 4. 매개변수도 있고, 반환값도 있는 메소드
	public int method4(int a, int b) {
		
		System.out.println("매개변수 있습니다, 반환값도 있습니다.");
		
		return a * b; // 리턴문 뒤에는 어떤 값이나 변수만 사용가능한게 아닌, 산수나 연산값 등 다양한 값 사용가능
	}
}
