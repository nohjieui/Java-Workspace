package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//3행 3 열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0 행 0 열부터 2 행 2 열까지 차례대로 접근하여 
		//"(0,0)" 과 같은 형식으로 저장 후 출력하세요
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d ,%d)", i, j);
			}
			System.out.println();
		}
		
	}
	
	public void practice2() {
		//4행 4 열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요
		//2) 저장된 값들을 차례대로 출력하세요
		
		int[][] arr = new int[4][4];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice3() {
		//4 행 4 열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1 과 같이 값을 거꾸로 저장하세요
		//2) 저장된 값들을 차례대로 출력하세요
		
		int[][] arr = new int[4][4];
		
		int value = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 16 - value++;
				
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		//4행 4 열 2 차원 배열을 생성하여 0 행 0 열부터 2 행 2 열까지는 1 10 까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요
		
		
		
		
		
	}
	
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되 1~10 사이 숫자가 아니면
		//"반드시 1~10 사이의 정수를 입력해야 합니다 ." 출력 후 다시 정수를 받게 하세요
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요
		//(char 형은 숫자를 더해서 문자를 표현할 수 있고 65 는 A 를 나타냄)
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int column = sc.nextInt();
		
		char[][] arr = new char[row][column];
		
		char value = 'A';
		
		if(row > 0 && row <= 10 && column > 0 && column <= 10) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					
					value = (char)(Math.random() * 90 + 1);
					arr[i][j] = value;
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
		}
		
		
	}
	
	public void practice6() {
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!!"}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice7() {
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당하세요
		// 그리고 각 인덱스에 'a' 부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int column = sc.nextInt();
			}
		
		char value = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void practice8() {
//		== 1분단 ==
//		강건강 남나나
//		도대담 류라라
//		문미미 박보배
//		== 2분단 ==
//		송성실 윤예의
//		진재주 차천축
//		피풍표 홍하하
		
		String[][] arr = {{"강건강", "남나나"}, {"도대담", "류라라"}, {"문미미", "박보배"}};
		String[][] arr2 = {{"송성실", "윤예의"}, {"진재주", "차천축"}, {"피풍표", "홍하하"}};
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		//x 번째 줄
		if(i == 0) {
			System.out.println("첫 번째 줄");
		} else if(i == 1) {
			System.out.println("두 번째 줄");
		} else if(i == 2) {
			System.out.println("세 번째 줄");
		} 
		
//		System.out.println("검색하신 차천축 학생은 2 분단 두 번째 줄 오른쪽에 있습니다");
		System.out.println("검색하신 "+ name +" 학생은 "+2+"분단 "+두 번째 줄+ 오른쪽+"에 있습니다");
		
		
	}
	
	public void practice9() {
		// 위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
		// 해당 학생이 어느 자리에 앉았는지 출력하세요
		// 검색할 학생 이름을 입력하세요 : xxx
		// 출력 -> 검색하신 차천축 학생은 2 분단 두 번째 줄 오른쪽에 있습니다
		
		String[][] arr = {{"강건강", "남나나", "도대담", "류라라", "문미미", "박보배"}, 
				{"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"}};
		
		String[][] arr2 = new String[3][2];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("== %d분단 ===\n",i+1);
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
//		System.out.printf("검색하신 %s 학생은 %d 분단 두 번째 줄 오른쪽에 있습니다" ,name, arr[1]);
		
	}

}
