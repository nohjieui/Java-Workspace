package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		System.out.println("==========학생 정보 출력==========");
		for(int i = 0; i <sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}

//		ssm.printStudent();
		
		System.out.println();
		
		System.out.println("==========학생 성적 출력==========");
		ssm.avgScore();
		
		System.out.println();
		
		System.out.println("==========성적 결과 출력==========");
		for(Student std : sArr) {
			String result = "통과";
			if(std.getScore() < StudentController.CUT_LINE) {
				result = "재시험 대상";
			}
			System.out.printf("%s학생은 %s입니다. \n", std.getName(), result);
		}
	}


}
