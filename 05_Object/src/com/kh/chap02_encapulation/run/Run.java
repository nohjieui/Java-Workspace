package com.kh.chap02_encapulation.run;

import com.kh.chap02_encapulation.model.vo.Student;

public class Run {
	/* 
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 틀을 갖추게하기.
	 *  * 캡슐화란? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로
	 *  		  클래스에서의 가장 중요한 목적인 '데이터의 접근제한'을 원칙으로
	 *            외부로부터 '데이터의 접근을 막고'
	 *            대신에 '데이터를 간접적으로나마 처리'할 수 있는 메소드를 클래스 내부에 작성해서 관리하는 방식.
	 *    캡슐화를 하지 않으면 : 외부로부터 직접접근이 가능하기 때문에 함부로 값이 변질되거나 조회를 막지 못하게 하는 문제 발생
	 *  
	 *    1) 정보은닉 : private
	 *       필드들을 외부로부터 직접 접근을 막기 위해 public 대신에 private 접근제한자 사용
	 *       ex) 학생들이 본인의 성적을 함부로 바꿀 수 없게, 다른학생의 성적이 함부로 조회되지 않도록
	 *       
	 *    2) setter / getter 메소드
	 *       간접적으로나마 접근해서 값을 담거나, 그 값을 가져올 수 있는 메소드가 setter / getter 메소드
	 *       ex) 선생님은 학생의 성적을 기록(저장)하거나 조회할 수 있는 권한이 있음.
	 * 
	 */
	public static void main(String[] args) {
		
		Student noh = new Student();
//		noh.name = "노지의"; //the filed Student.name is not visible
//		noh.age = 28;
//		noh.height = 155.3;
		
		/*
		 * 위와 같이 대입할 경우 직접 접근이 불가능해짐
		 * 그러면 직접적인 접근을 막은경우 간접적으로나마 접근할 수 있는 방법 ?
		 * setter / getter 
		 */
		// setter메소드 호출
		noh.setName("노지의");
		noh.setAge(28);
		noh.setHeight(155.3);
		
		System.out.println(noh.information());
		
	}

}
