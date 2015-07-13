package loop;
/*
 * @ date: 2015.07.13
 * @ Author : me
 * @ story : for+if
 */
import java.util.Scanner;

public class EvenOddSum {
	public void cals() {
		Scanner scanner = new Scanner(System.in);
		int num=0,num2=0,a=0,b=0;
		System.out.println("시작수를 입력하세요 : ");
		num=scanner.nextInt();
		System.out.println("끝수를 입력하세요 : ");
		num2=scanner.nextInt();
	
		for (int i = num; i <= num2; i++) {
			if (i%2==0) {
				a+=i;
			} else {
				b+=i;
			}
		}
		
		System.out.println("입력하신 "+num+" 부터 "+num2+"까지\n짝수의 합은 "+a+"이고\n홀수의 합은 "+b+"이다");
	}
}
