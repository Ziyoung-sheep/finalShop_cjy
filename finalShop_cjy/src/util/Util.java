package util;

import java.util.Scanner;

public class Util {
	
	//각종 유틸 배정
	//랜덤은 없을 것 같고 입력이나 싱글톤으로 만들어두기
	
	private static Util instance;
	private static Scanner sc=new Scanner(System.in);
	
	public static Util getInstance() {
		if (instance==null)  instance=new Util();
		return instance;
	}

	public static int getIntValue(String msg, int start, int end) {
		while(true){
			System.out.printf("%s(%d-%d)>>\n", msg, start, end);
			try {
				int num=sc.nextInt();
				sc.nextLine();
				if (num<start||num>end) {
					System.err.println("입력 범위를 벗어났습니다.");
					continue;
				}
				return num;
			} catch (Exception e) {
				System.err.println("입력 방식이 잘못되었습니다.");
				continue;
			}
		}
	}
	
	public int getIntValue(String msg) {
		while(true){
			System.out.println(msg+">>");
			try {
				int num=sc.nextInt();
				sc.nextLine();
				return num;
			} catch (Exception e) {
				continue;
			}
		}
	}
	
	public static String getStringValue(String msg) {
		while(true){
			System.out.println(msg+">>");
			try {
				String temp=sc.next();
				sc.nextLine();
				return temp;
			} catch (Exception e) {
				continue;
			}
		}
	}
}
