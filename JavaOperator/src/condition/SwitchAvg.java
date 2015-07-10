package condition;
/*
 * @ date: 2015.07.10
 * @ Author : me
 * @ story : switch 예제 (합격여부 구하기)
 */
import java.util.Scanner;

public class SwitchAvg {
	public void avg() {
		Scanner scanner = new Scanner(System.in);
		String name,hab; 
		int kor=0,eng=0,math=0,sum=0,avg=0;
				
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
		
		switch(avg/10) {
		case 10:case 9:hab="장학생";break;
		case 8:case 7:hab="합격";break;
		default:hab="불합격";break;
		}
		
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+hab);
	}
}
	

