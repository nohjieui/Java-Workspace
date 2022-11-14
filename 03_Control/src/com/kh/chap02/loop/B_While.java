package com.kh.chap02.loop;

public class B_While {

	/*
	 * while 문
	 * 
	 * [표기법]
	 * [초기식;] // 필수가 아님
	 * while(조건식) { //조건이 true 일 경우 해당 구문들을 반복적으로 실행, 조건식 내용에 true를 작성 시 무한반복함
	 *     반복적으로 실행 할 코드
	 *     [증감식]; // 필수는 아님
	 * }
	 * 
	 * for문과 다르게 초기식, 증감식 필수가 아님.
	 * 
	 * 분기문에서 초기식, 증감식없이 작성하는 법을 배울 예정.
	 */
	
	public void method1() {
		// for문을 while문으로 , while문을 for문으로 표현할 수 있음.
		
		for(int i = 0; i <5; i++) {
			System.out.println("안녕하세요!");
		}
		
		System.out.println();
		
		int i = 0; // 초기식
		while(i < 5) { // 조건식
			System.out.println("안녕하세요!");
			i++; // 증감식
		}
		
		System.out.println("i : " + i);
	}
	
	public void method2() {
		// 1 ~ 10 사이의 정수 중 홀수만 출력
		// 처음에는 for문으로, 그 다음에 while문으로 변경
		
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i <=10; i+=2) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
//		int i = 1;
//		while(i < 10) {
//			if(i % 2 == 1) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		
		
		int i = 1;
		while(i <=10) {
			System.out.print(i + " ");
			i+=2;
		}
		
		
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100)까지의 총 합계
		
		int random = (int)(Math.random() * 100 + 1);
		// 0.0 <= 랜덤값 < 100.0
		// 1.0 <= 랜덤값 < 101.0
		// 1.0 <= 랜덤값 <= 100.0 -> 1 <= 랜덤값 <= 100
		
		int sum = 0;
		
//		int i = 1;
//		while(i <= random) {
//			sum += i;
//			i++;
//		}
		
		while(random > 0) {
			sum += random--;
		}
		
		System.out.println("1부터 "+ random + " 까지의 총 합계 : " + sum);
		
	}
	
	public void method4() {
		// A_For 9번 메서드를 while 문으로 바꾸기
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("문자 입력 : ");
		
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : "+ str.length());
		
		int i = 0;
		while(i < str.length()) {
			System.out.print(str.charAt(i) + " ");
			i++;
		}
		
	}
	
	/*
	 * do-while문
	 * [표현법]
	 * do { // 조건검사없이 무조건 1번 do(실행) -> 조건이 맞지 않더라도 반드시 한번은 수행
	 *      실행할 코드
	 * } while(조건식); // 조건식의 결과과 true면 실행할 코드를 다시 실행
	 *                // 조건식의 결과가 false면 반복문을 빠져나옴.
	 *                
	 * for/while문과 do-while문의 차이점
	 * for/while문은 처음 시작할 때부터 조건검사를 하고 반환값이 true야 실행을 하는데,
	 * do-while문은 첫실행은 무조건 조건검사 없이 실행함.
	 */
	
	
	public void method5() {
		// 조건식이 맞지 않은 경우에 do=while문 테스트
		
		int num = 900;
		
		do {
			System.out.print("Hi");
		} while(num == 0);
		
	}
	
	public void method6() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i++ + " ");
		} while(i <= 5);
		
	}
	
	public void method7() {
		// 1부터 사용자가 입력한 숫자까지의 총 합계
		// 1. do-while문 사용
		// "1부터 x까지의 총 합계 : xx
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		do {
			sum += i++;
//			i++;
		} while (i <= num);
		System.out.printf("1부터 %d까지의 총 합계 : %d", num, sum);
		
	}
	
}
