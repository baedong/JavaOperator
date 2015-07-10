package condition;

public class Onlyif {
	public static void main(String[] args) {
		int x=1,y=2;
		if ((x==1)&&(y==1)) {// &&(엔퍼센트) and 연산자
			System.out.println("x는 1이면서, y도 2이다");
		}
		if ((x==1)||(y==1)) {// ||(컬럼)  or 연산자
			System.out.println("x는 1이거나, y는 2이다");
		}
	}
}
