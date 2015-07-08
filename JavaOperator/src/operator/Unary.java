package operator;
/*
 * @ date: 2015.07.07
 * @ Author : me
 * @ story : 단항 연산자 문법
 */
public class Unary {
	/*
	 단항연산자
	 i++(후위연산자) 또는 ++i(전위연산자)
	 */
	public static void main(String[] args) {
		int i=5,j=0,x=5,y=0;//지역변수는 디폴트값으로 초기화
		j=i++;//후의 형은 변수값을 읽어온 후 연산한다.
		System.out.println("j의 값은 \t"+j);
		y=++x;//전위형은 x 의 값을 증가시키고 연산한다 i=i+1;
		System.out.println("y의 값은 \t"+y);
	}
}
