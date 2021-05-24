package ex.java.day1;

import java.util.Scanner;

public class PetCodeEg {

	public static void main(String[] args) {
		// 애완동물 이름 번역 매칭  

				Scanner sc = new Scanner(System.in);
				
				String[] petkor = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
				
				String[] peteng = {"Bear","Gift","White","Sesami","Black"};
				
				System.out.println("강아지 이름 입력");
				String str = sc.nextLine();
				
				int pos = -1; 
				
				for(int i=0; i<5; i++) {
					if(str.equals(petkor[i])) { // if-else문으로 petkor[i]를 전부 등록해야 하나 고민 
						System.out.println(peteng[i]);
						//break;
						
					}else {
						System.out.println("등록되지 않았습니다.");
						//break;
						
					}						
				}
			}

		}