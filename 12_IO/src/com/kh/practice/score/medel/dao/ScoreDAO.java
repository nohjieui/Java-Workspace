package com.kh.practice.score.medel.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입,출력하는 클래스

public class ScoreDAO {
	
	//매개변수들을 DataOutputStream을 통해 파일에 저장
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt",true))) {
						
			String data = name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg;
			//노지의	50	60	70	180	60
			dos.writeUTF(data);
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//파일을 DataInputStream을 통해 읽어옴
	public DataInputStream readScore() throws FileNotFoundException {
		DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"));
		
		return dis;
	}

}
