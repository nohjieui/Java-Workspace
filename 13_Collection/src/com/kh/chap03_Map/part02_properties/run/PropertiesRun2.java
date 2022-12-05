package com.kh.chap03_Map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {

		Properties prop = new Properties(); // 비어있는 상태
		
		try {
			// 5. load(InputStream is)
			//prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		5. 출력
//		System.out.println(prop);
//		System.out.println(prop.getProperty("Map")); // 원하는 값만 출력
//		6. 출력
		System.out.println(prop);
		System.out.println(prop.getProperty("List"));
	}

}
