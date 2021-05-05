package chap02.array;

import java.util.Scanner;

public class RcopyQ5 {
	
	// 내 풀이
//	static void swap(int[] a, int idx1, int idx2) {
//		int t = a[idx1];
//		a[idx1] = a[idx2];
//		a[idx2] = t;
//	}
//	
//	static void reverse(int[] a) {
//		for (int i=0; i<a.length/2; i++) {
//			swap(a, i, a.length-i-1);
//		}
//	}
//	
//	static void rcopy(int[] a, int[] b) {
//		int num = a.length <= b.length ? a.length : b.length;
//		reverse(b);
//		
//		for (int i=0; i<num; i++) {
//			a[i] = b[i];
//		}
//	}
	
	// 책 풀이
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i=0; i<num; i++) {
			a[i] = b[b.length-i-1];
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
		
		System.out.println("배열 b의 역순을 a에 복사합니다.");
		rcopy(a, b);
		
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		sc.close();
	}
	
}
