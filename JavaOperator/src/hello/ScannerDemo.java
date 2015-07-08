package hello;

import java.util.Scanner;

/*
 * @ date: 2015.07.07
 * @ Author : me
 * @ story : 스캐너 사용으로 인풋작업 실행
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = scanner.nextInt();
		System.out.println(number);
	}
}
