package condition;
/*
 * @ date: 2015.07.10
 * @ Author : me
 * @ story : if-else 예제(큰수구하기)
 */
import java.util.Scanner;

/*
 * 문제 ) 학생 3명의 점수 입력받아서 일등 출력
 * 결과 ) 1등은 98점 입니다 
 */
public class BigNumber {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if (a>b && a>c) {
			System.out.println("1등은 "+a+" 입니다");
		} else if(b>a && b>c){
			System.out.println("1등은 "+b+" 입니다");
		} else{
			System.out.println("1등은 "+c+" 입니다");
		}
	}
}
