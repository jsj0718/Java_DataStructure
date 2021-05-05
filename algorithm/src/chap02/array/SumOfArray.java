package chap02.array;

import java.util.Scanner;

public class SumOfArray {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a[" + i  + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("총 합계 : " + sumOf(a));
		
		sc.close();
	}

}
