package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
		// 방법 1
		int[] arr = new int[10];
		
		for(int i = arr.length -1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 방법 2
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] +" ");
		}
		
	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 / 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		// 길이가 5 인 String 배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외" 로 초기화 한 후 
		// 배열 인덱스를 활용해서 귤을 출력하세요
		
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
		
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		//검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		
		// 1. 문자열, 문자 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine(); //application
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); //i
		
		// 2. 문자열의 문자를 하나하나 배열에다가 담기
		char[] arr = new char[str.length()]; //11
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 3. 검색할 문자가 문자열에 몇개 있는지, 어느 인덱스에 있는지
		
		int count = 0;
		String index = ""; //4 8
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				//갯수 증가
				index += i + " ";
				count++;
			}
		}
		
		// 4. 출력문 출력
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n",str, ch, index);
		System.out.printf("%c의 개수 : %d", ch, count);
		

//		//위와 동일한 같은 방법
//		//str.length(), arr.length 의 length는 다른 값임
//		//arr.length 는 arr안에 있는 별도의 변수
//		
//		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str, ch );
//		
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = str.charAt(i);
//			if(arr[i] == ch) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("i 개수 : " + count);
		
	}
	
	public void practice6() {
		//"월" ~ "일" 까지 초기화된 문자열 배열을 만들고 0 부터 6 까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 잘못 입력하셨습니다 를 출력하세요
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0~6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 6 && num >= 0) {
			System.out.println(day[num]+"요일");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
	}
	
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
		
	}
	
	public void practice8() {
		// 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1 부터 1 씩 증가하여 오름차순으로 값을 넣고
		// 중간 이후부터 끝까지는 1 씩 감소하여 내림차순으로 값을 넣어 출력하세요
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 다시 입력하세요 를 출력하고
		// 다시 정수를 받도록 하세요
		
		// 1. 3 이상인 홀수 자연수 입력받기
		//    단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 다시 입력하세요 를 출력하고 / 다시 정수를 받도록 하세요
		System.out.print("3 이상인 홀수 자연수 입력 : ");
		int num = sc.nextInt();
		
		if(num < 3 || num % 3 != 0) {
			System.out.println("다시 입력하세요");
			practice8();
		} else {
			// 2. num 의 배열 변수 선언 후 생성
			int[] arr = new int[num]; //5
			
			// 0 1 2 인덱스 -> 1, 2, 3
			for(int i = 0; i <= num/2; i++) {
				arr[i] = 1+i;
			}
			
			// 3 4 인덱스 -> 2, 1
			int value = 1;
			for(int i = num/2+1; i < arr.length; i++) {
//				arr[i] = arr.length - 3;
				arr[i] = num/2 + 1 -value;
				value++;
			}
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[j] + (j == arr.length-1 ? "": ", "));
			}
		}
		
		
	}
	
	public void practice9() {
		// 사용자가 입력한 값이 배열에 있는지 검색하여 있으면
		// "OOO 치킨 배달 가능 ", 없으면 "OOO 치킨은 없는 메뉴입니다" 를 출력하세요
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
		
		String[] menu = {"후라이드", "양념", "고추바사삭","허니콤보"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chiken = sc.nextLine();
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(chiken)) {
				System.out.println(chiken + " 치킨 배달 가능");
				return; // 아래내용이 실행되지 않게끔 종료시킴
			}
		}
		System.out.println(chiken + " 치킨은 없는 메뉴입니다.");
	}
	

}



















