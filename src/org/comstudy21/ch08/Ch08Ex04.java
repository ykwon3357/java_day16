package org.comstudy21.ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Ch08Ex04 {

	public static void main(String[] args) throws IOException {
		InputStream is = Ch08Ex04.class.getResourceAsStream("person.json");
		
//		int data =0;
//		while((data=is.read()) != -1){
//			System.out.print((char)data);
//		}
		
		// 표준 문자 스트림
//		InputStreamReader isr = new InputStreamReader(is,Charset.forName("UTF-8"));
//		BufferedReader br = new BufferedReader(isr);
//		
//		String line = null;
//		while((line = br.readLine()) != null){
//			System.out.println(line);
//		}
		
		// 스트림 -> 토크너 -> 객체로 변환
		JSONTokener tokener = new JSONTokener(is);
		JSONObject json = new JSONObject(tokener);
		System.out.println(json.get("name"));
		System.out.println(json.get("addr"));
		System.out.println(json.get("age"));
		
		JSONObject json2 = new JSONObject();
		json2.put("name", "이순신");
		json2.put("addr", "전라남도 한산도");
		json2.put("age", 35);
		System.out.println(json2 instanceof JSONObject);
		
		String jsonStr = json2.toString();
		System.out.println(jsonStr);
	}

}
