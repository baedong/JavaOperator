package operator;

import java.util.Scanner;

/*
 * @ date: 2015.07.07
 * @ Author : me
 * @ story : 연산 코드에 관한 문법
 */
public class OpCode {
	public static void main(String[] args) {
		/*
		 연산자(opcode)는 다음과 같이 분류된다
		 1. 단항 연산자 : ++, --, +, -
		 2. 이항 연산자  
		 	(1) 산술연산자 : + - * /(몫) %(나머지)
		 	(2) 비교연산자 : < > != ==
		 	(3) 삼항연산자 : (...)? TRUE : FALSE
		 	(4) 대입(할당)연산자 : = 
		 */
		// ctrl + shift + o
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을 입력하세요");
		int a = scanner.nextInt();// 스캐너로 입력한 값을 a 에 할당함
		System.out.println("연산할 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println(a+b);
	}
}
