package ex.java.day1;

import java.util.Scanner;

public class MorseCodeEg {
	public static void main(String[] args) {
		// 모스 부호 만들기 이동희님 예시 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장, 문자를 입력해주세요.");
		String[] str = sc.nextLine().split(""); //
		
		String result = "";
		for(int i = 0; i < str.length; i++){
		
			if("A".equalsIgnoreCase(str[i])) {
				result += ".- ";
			}	else if("B".equalsIgnoreCase(str[i])) {
					result += "-... ";
			}	else if("C".equalsIgnoreCase(str[i])) {
					result += "-.-. ";
					
					
			}
			
			
		}
		

	}

}
