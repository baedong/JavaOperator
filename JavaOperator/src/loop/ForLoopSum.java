package loop;
/*
 * @ date: 2015.07.10
 * @ Author : me
 * @ story : for loop 을 활용한 1부터 10까지 합
 */
public class ForLoopSum {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=10 ; i++) {
			sum += i;
		}
		System.out.println("1~10까지 합 = "+sum);
	}
}
