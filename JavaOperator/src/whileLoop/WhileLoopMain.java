package whileLoop;
/*
 * @ date: 2015.07.09
 * @ Author : me
 * @ story : while loop 문법
 */
public class WhileLoopMain {
	/* loop : 원단어 뜻은 순환의 의미
	 * 인덱스값을 통해 순환 횟수를 설정하고
	 * limit 값을 통해 마감인덱스까지만 회전한다
	 * while loop 은 limit 값을 알수 있는 상황과 없는 상황 두가지 버전으로 사용된다
	 * limit 값이 설정된경우
	 * 
	 */
	public static void main(String[] args) {
		int idx=1;
		while (idx < 11) {
			System.out.print(idx + "\t");
			idx++;
		}
	}
}
