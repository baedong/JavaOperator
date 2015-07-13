package array;

import java.util.Scanner;

/*
 * @ date: 2015.07.13
 * @ Author : me
 * @ story : int형 배열에서 입력 값중 최대 값 구하기
 */
public class InputMax {
	public static void main(String[] args) {
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int score;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		if (arr[0]>arr[1] && arr[0]>arr[2]) {
			score=arr[0];
		} else if(arr[1]>arr[0] && arr[1]>arr[2]) {
			score=arr[1];
		} else {
			score=arr[2];
		}
		System.out.println("최고 점수는 : "+score);
	}
}
