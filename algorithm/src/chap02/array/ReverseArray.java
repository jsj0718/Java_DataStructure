package chap02.array;

import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		int n = a.length;
		for (int i=0; i<(n/2); i++) {
			swap(a, i, n-i-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("요소 개수 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("요소 역순으로 정렬하기");
		reverse(a);
		for (int i=0; i<n; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		sc.close();
	}

}
