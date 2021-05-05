package chap02.array;

import java.util.Scanner;

public class ReverseArrayQ2 {

/*  내풀이
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		int n = a.length;
		for (int i=0; i<n/2+1; i++) {
			for (int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			if (i == n/2) {
				break;
			}
			swap(a, i, a.length-i-1);
			System.out.println("\na[" + i + "]과(와) a[" + (n-i-1) + "]를 교환합니다.");			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		reverse(a);
		System.out.println("\n역순 정렬을 마칩니다.");
		
		sc.close();
	}
*/
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void print(int[] a) {
		for (int i=0; i<a.length; i++) { 
			System.out.print(a[i] + " ");
		}
	}
	
	static void reverse(int[] a) {
		print(a);
		System.out.println();
		for (int i=0; i<a.length/2; i++) {
			System.out.println("a[" + i + "]과(와) " + "a[" + (a.length-i-1) + "]를 교환합니다.");
			print(a);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		reverse(a);
		System.out.println("역순 정렬을 마칩니다.");
		
		sc.close();
	}
}
