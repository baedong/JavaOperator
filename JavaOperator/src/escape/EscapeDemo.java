package escape;

import java.util.Scanner;

public class EscapeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int HongAge = 0 , KimAge=0 , age=0;//디폴트 값 선언
		String hong ="",kim="";
		System.out.println("이름입력 : ");
		hong=scanner.next();
		System.out.println("이름입력 : ");
		kim=scanner.next();
		System.out.println(hong+"씨의 나이입력 : ");
		HongAge = scanner.nextInt();
		System.out.println(kim+"씨의 나이입력");
		KimAge = scanner.nextInt();
		age = HongAge - KimAge;
		System.out.println(hong+"씨는\t"+kim+"씨보다 "+age+"세가 많습니다");
	}
}
