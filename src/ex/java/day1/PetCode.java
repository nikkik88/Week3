package ex.java.day1;

import java.util.Scanner;

public class PetCode {

	public static void main(String[] args) {
		// 애완동물 이름 번역 매칭  
		Scanner sc = new Scanner(System.in);		
		String[] petkor = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] peteng = {"Bear","Gift","White","Sesami","Black"};
		
		System.out.println("강아지 이름을 입력해주세요");
		String str = sc.nextLine();
		
		for(int i=0; i<petkor.length; i++) {
				if(str.equals(petkor[i])) {
					System.out.println(peteng[i]);
				}
			}
		}

	}
