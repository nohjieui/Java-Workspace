package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// 프로그램 --> 외부매체(파일)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2byte 단위로 출력하는 스트림
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("와! IO 재밌다! \n");
			fw.write('A');
			fw.write(' ');
			
			char[] cArr = {'a', 'p', 'p', 'l','e'};
			fw.write(cArr);
			
			fw.flush(); // FileWriter 내부 버퍼의 내용을 파일에 writer한다.
			            // flush()를 호출하지 않는다면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올 수 있음
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // FileWriter는 스트림을 이용하여 파일의 내용을 읽어들인다.
				            // 이때 close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능하다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 <-- 외부매체(파일)
	public void FileRead() {
		
		// FileReader : 파일로부터 데이터를 2byte단위로 입력받는 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
