package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("상관없는거 아닌가?","문학동네","장기하"); //title, publisher, author
		b2.inform();
		
		Book b3 = new Book("상관없는거 아닌가?","문학동네","장기하", 14500, 30.0);
		b3.inform();
	}

}
