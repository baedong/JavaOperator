package condition;

import java.util.Scanner;

/*
 * @ date: 2015.07.07
 * @ Author : me
 * @ story : 사칙연산 계산 프로그램
 	오더
 	- 사칙연산 계산기
 	- 덧셈, 뺄셈, 곱셈, 나눗셈(몫 : , 나머지:)
 	- 사칙연산 기호도 입력받습니다
 	- 출력결과
 	- == 심플 계산기 ==
 	- 5 X 5 = 25
 	- 5 + 5 = 10
 	- 6 ÷ 5 = 1 (1)
 	- 5 - 6 = -1
 */
public class ArithmeticCalc {
	public void calc(){
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,result=0,nmg=0;
		String tast="";
		System.out.println("숫자입력 : ");
		a=scanner.nextInt();
		System.out.println("기호입력 : ");
		tast=scanner.next();
		System.out.println("숫자입력 : ");
		b=scanner.nextInt();
		System.out.println("=== 심플 계산기 ===");
		
		if(tast.equals("+")){
			result=a+b;
			System.out.println(a+" "+tast+" "+b+" = "+result);
		}
		else if(tast.equals("-")){
			result=a-b;
			System.out.println(a+" "+tast+" "+b+" = "+result);
		}
		else if(tast.equals("*")){
			result=a*b;
			System.out.println(a+" "+tast+" "+b+" = "+result);
		}
		else if(tast.equals("/")){
			result=a/b;	nmg=a%b;
			System.out.println(a+" "+tast+" "+b+" = "+result+"  나머지 = "+nmg);	
		}
		else{
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
	}
}