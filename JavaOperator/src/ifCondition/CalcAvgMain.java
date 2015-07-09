package ifCondition;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/*
 * @ date: 2015.07.09
 * @ Author : me
 * @ story : if-else 예제
 * 		프로그램을 하나 개발해야 합니다
 * 		오더
 * 		평균이 90점 이상이면 장학생 
 * 		70점이상 90미만이면 합격
 * 		70점 미만이면 불합격 
 * 		학생	국어	영어	수학	총점	평균	합격여부
 * 		--------------------------------------------------------
 * 		홍길동	90		90		90		270		90		장학생
  */
public class CalcAvgMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name,hab; 
		int kor=0,eng=0,math=0,sum=0;
		double avg=0;
		
		System.out.println("이름 입력 : ");
		name=scanner.next();
		System.out.println("국어 점수 입력 : ");
		kor=scanner.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng=scanner.nextInt();
		System.out.println("수학 점수 입력 : ");
		math=scanner.nextInt();
		sum=kor+eng+math;
		avg=sum/3;
		
		if (avg>=90) 
			hab="장학생";		
		else if (avg>90 || avg>=70)
			hab="합격";
		else  
			hab="불합격";
		
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+hab);
	}
}
