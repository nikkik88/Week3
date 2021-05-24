package ass.java.day1;

import java.util.Scanner;

public class May21Review1 {

	public static void main(String[] args) {
		// 10명 학생에 수학/과학/영어 과목처리
				// "/sum"치면 통계 출력 : "수학 : 합산/평균"
				Scanner scanner = new Scanner(System.in);
				Student[] students = new Student[10];
				
				int mathSum = 0;
				int sciSum = 0;
				int engSum = 0;
				
				for (int i = 0; i < 10; i++) {
					students[i] = new Student();
					students[i].sc = new Score[3];

					for (int j = 0; j < 3; j++) {
						students[i].sc[j] = new Score();
					}
					
					String str = scanner.nextLine();
					students[i].name = str.split("/")[0];
					students[i].grade = Integer.parseInt(str.split("/")[1]);
					students[i].address = str.split("/")[2];
					students[i].sc[0].subject = "수학";
					students[i].sc[0].score = Integer.parseInt(str.split("/")[3]);
					mathSum += students[i].sc[0].score;
					students[i].sc[1].subject = "과학";
					students[i].sc[1].score = Integer.parseInt(str.split("/")[4]);
					sciSum += students[i].sc[1].score;
					students[i].sc[2].subject = "영어";
					students[i].sc[2].score = Integer.parseInt(str.split("/")[5]);
					engSum += students[i].sc[2].score;
					
					System.out.println((i + 1) + "/10");
				}
				
				String msg = scanner.nextLine();
				if (msg.equals("/sum")) {
					System.out.println("수학: " + mathSum + "/" + (mathSum / 10));
					System.out.println("과학: " + sciSum + "/" + (sciSum / 10));
					System.out.println("영어: " + engSum + "/" + (engSum / 10));
				}
			}

		}