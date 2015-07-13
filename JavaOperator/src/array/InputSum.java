package array;

import java.util.Scanner;

/*
 * @ date: 2015.07.13
 * @ Author : me
 * @ story : int형 배열 입력 예제
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int sum=0,avg=0;
		
		System.out.println("3개의 점수를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n합계 : "+sum);
		System.out.println("평균 : "+sum/arr.length);
	}
}
