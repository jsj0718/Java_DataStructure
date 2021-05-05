package chap02.array;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i=0; i<a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
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
		
		if (equals(a, b)) {
			System.out.println("배열 a와 b는 같습니다.");
		} else {
			System.out.println("배열 a와 b는 다릅니다.");
		}
		
		sc.close();
	}

}
