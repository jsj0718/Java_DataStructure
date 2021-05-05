package chap02.array;

import java.util.Scanner;

public class CopyQ4 {
	
	static void copy(int[] a, int[] b) {
		// 길이가 짧은 것으로 범위 설정
		int num = a.length <= b.length ? a.length : b.length;
		for (int i=0; i<num; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요소수 : ");
		int numOfA = sc.nextInt();
		int[] a = new int[numOfA];
		for (int i=0; i<numOfA; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요소수 : ");
		int numOfB = sc.nextInt();
		int[] b = new int[numOfB];
		for (int i=0; i<numOfB; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 b를 배열 a에 복사합니다.");
		copy(a,b);
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		sc.close();
	}
	
}
