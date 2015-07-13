package array;
/*
 * @ date: 2015.07.13
 * @ Author : me
 * @ story : int형 배열 예제
 */
public class IntArrayDemo2 {
	public static void main(String[] args) {
		/* 자바배열의 특징
		 * 1. 배열은 0부터 인덱스 번호가 시작된다.
		 * 2. 배열의 크기 = 배열의 요소의 갯수
		 * 3. 배열은 크기가 고정되어 있으며 요소를 추가할 수 없다.
		 * 4. 배열은 한가지 타입만 지정할수 있다.
		 */
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for (int i = 0; i < arr.length; i++) {
			//arr 은 바로 직전에 선언한 객체[배열]이름
			//배열객체.length 는 배열의 크기
			System.out.print(arr[i]+"\t");
		}
	}
}
