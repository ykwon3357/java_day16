package org.comstudy21.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch08Ex02 {
	public static void main(String[] args) throws IOException {
		int data =0;
		InputStream fis = Ch08Ex02.class.getResourceAsStream("data.txt");
		OutputStream os = System.out;
		
		while((data=fis.read())!=-1){
			os.write(data);
		}
	}

	public static void test(String[] args) throws IOException {
		int data=0;
		InputStream is = System.in;
		FileOutputStream fos = new FileOutputStream("E:\\test.data");
		
		System.out.println("데이터 입력(끝내기 Ctrl+z)>>> ");
		while((data=is.read())!=-1){
			fos.write(data);
		}
		is.close();
		fos.close();
	}

}
