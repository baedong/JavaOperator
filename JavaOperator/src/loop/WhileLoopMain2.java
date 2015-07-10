package loop;
/*
 * @ date: 2015.07.09
 * @ Author : me
 * @ story : while loop 문법
 */
public class WhileLoopMain2 {
	public static void main(String[] args) {
		int idx=0;
		while (true) {
			idx++;
			System.out.print(idx+"\t");
			if (idx==10) {
				break;
			}
		}		
	}
}
