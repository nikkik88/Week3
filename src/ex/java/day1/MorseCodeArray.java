package ex.java.day1;

import java.util.Scanner;

public class MorseCodeArray {

	public static void main(String[] args) {
		// 모스 부호를 배열로 넣어서 코딩하기 

		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.","---",".--.",
				"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		String[] ap = {
				"A","B","C","D","E","F","G",
				"H","I","J","K","L","M","N",
				"O","P","Q","R","S","T","U",
				"V","W","X","Y","Z"
		};
		
		String result = "";
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<ap.length; j++) {
				if(str[i].equalsIgnoreCase(ap[j])) {
					result += morse[j]+ " ";
					continue;
				}
			}
		}
		
		System.out.println(result);
	}

}
