package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		int eng = scanner.nextInt();
		System.out.println("국어점수를 입력하세요 : ");
		int math = scanner.nextInt();
		int total = kor + eng + math;
		System.out.println("총점 : "+total);
	}
}
