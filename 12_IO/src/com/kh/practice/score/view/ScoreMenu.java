package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 : saveScore(); break;
			case 2 : readScore(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void saveScore() {
		int num = 0;
		while(true) {
			System.out.println(++num + "번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			
			int sum = kor + eng + math;
			double avg = sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char n = sc.nextLine().charAt(0);
			if(n == 'n' || n == 'N') {
				break;
			}
		}
	}
	
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		
		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		try (DataInputStream dis = scr.readScore()){
			// 안에 들어가있는 데이터를 가지고 와서 출력
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			String value = null;
			while((value = dis.readUTF()) != null) { 
				System.out.println(value);
				count++;
				String[] result = value.split("\t");
				sumAll += Integer.parseInt(result[4]);
//				avgAll += Integer.parseInt(result[5]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		} catch (EOFException e) {
			// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+(sumAll/count));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
