package variable;

public class Total {
	public static void main(String[] args) {
		int kor = 60, eng = 60, math = 60;
		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+avg);
	}
}
