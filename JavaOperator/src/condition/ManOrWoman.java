package condition;

import java.util.Scanner;
/*
 * @ date: 2015.07.10
 * @ Author : me
 * @ story : switch 예제 (성 판별기)
 */
public class ManOrWoman {
	public  void ssn() {
		Scanner scanner = new Scanner(System.in);
		String msg = "";
		
		System.out.println("주민번호를 입력하세요 (예 800101-2121247)");
		String ssn = scanner.next();
		char ch = ssn.charAt(7); // charAt(n) 이 메소드는 0 부터 시작하여 n번째 글자 하나만 리턴해줌
		
		switch (ch) {
		case '1':	case '3': msg= "남성입니다";break;
		case '2':	case '4': msg= "여성입니다";break;
		case '5':	msg="외국인입니다"; break;
		default: msg="잘못입력하셨습니다";break;
		}
		System.out.println("입력하신 ssn은 "+msg);
	}
}
