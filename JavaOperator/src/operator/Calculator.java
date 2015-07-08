package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,sub=0,add=0,gob=0,mok=0,nmg=0;//지역변수는 디폴트값을 초기화
		System.out.println("숫자 2개를 입력하세요 :");
		a=scanner.nextInt(); b=scanner.nextInt();// next = 커서 다음 글자(숫자)를 변수에 할당하라
		sub=a-b; add=a+b; gob=a*b; mok=a/b; nmg=a%b;
		System.out.println(a+" + "+b+" = "+add);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+gob);
		System.out.println(a+" / "+b+" = "+mok);
		System.out.println(a+" % "+b+" = "+nmg);
	}
}
