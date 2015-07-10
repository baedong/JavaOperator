package condition;

import java.util.Scanner;

public class ClacAvg {
	public void calcAvg(){
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
