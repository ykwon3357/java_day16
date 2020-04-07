package org.comstudy21.ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LoveLove {
	private StringBuffer buffer;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	private String word;
	private StringTokenizer token;
	private String key, value;

	public LoveLove() {
		play();
	}

	public void play() {
		System.out.print(">>");
		String str = scan.nextLine();
		buffer = new StringBuffer(str);
		System.out.println(buffer);
		while (true) {
			System.out.print("명령: ");
			word = scan2.next();
			if (word.equals("그만")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			token = new StringTokenizer(word, "!");
			if (token.countTokens() != 2) {
				System.out.println("잘못 된 명령입니다!");
			} else {
				key = token.nextToken();
				value = token.nextToken();
				int start = buffer.indexOf(key);
				if (start == -1) {
					System.out.println("찾을 수 없습니다!");
				} else {
					StringTokenizer st = new StringTokenizer(new String(buffer)," ");
					boolean flag = false;
					while (st.hasMoreTokens()) {
						if (key.equals(st.nextToken())) {
							flag = true;
							break;
						}
					}
					if (flag) {
						int end = start + key.length();
						buffer.replace(start, end, value);
						System.out.println(buffer);
					} else {
						System.out.println("찾을 수 없습니다.");
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		new LoveLove();
	}

}
