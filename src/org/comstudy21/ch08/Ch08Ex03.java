package org.comstudy21.ch08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
//import java.util.Date;

public class Ch08Ex03 {
	public Ch08Ex03() throws IOException{
		String spec = "https://t1.daumcdn.net/cfile/tistory/2657B9505809B4B634";
		URL url = new URL(spec);
		
		InputStream is = url.openStream();
		FileOutputStream fos=null;
		
		File file = new File("test.jpg");
		//File file = new File("./"+new Date().toString()+".jpg");
		if(!file.exists()){
			if(file.createNewFile()){
				fos = new FileOutputStream(file);
				int data=0;
				while((data=is.read())!=-1){
					fos.write(data);
				}
				fos.close();
			}
		}
		if(is!=null) is.close();
		if(fos!=null) fos.close();
	}
	public static void main(String[] args) throws IOException {
		new Ch08Ex03();
	}
	public static void test2(String[] args) {
		File file = new File("./src/org.comstudy21/ch08");
		if(file.isDirectory()){
			System.out.println("디렉토리입니다!");
			String[] fileNames =file.list();
			for(String fileName : fileNames){
				System.out.println(fileName);
			}
		}
		
		file = new File(".");
		if(file.canRead()) {
			System.out.println("읽을 수 있습니다.");
			System.out.println(file.getAbsolutePath());
		}
	}
	public static void test(String[] args) throws IOException {
		File file = new File("test.txt");
		if (file.exists()) {
			System.out.println("파일이 존재 합니다.");
			if (file.delete()) {
				System.out.println("파일이 삭제 되었습니다.");
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
			if (file.createNewFile()) {
				System.out.println("새 파일이 생성 되었습니다.");
			}
		}

	}

}
