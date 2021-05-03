package chap01.figure;

import java.util.Scanner;

public class TriangleQ15 {
	
	// 왼쪽 아래가 직각
	static void triangleLB(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각
	static void triangleLU(int n) {
		for (int i=n; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각
	static void triangleRB(int n) {
		for (int i=n; i>=1; i--) {
			for (int j=1; j<=n; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각
	static void triangleRU(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		do {
			System.out.println("몇 단입니까?");
			System.out.print("단 수 : "); n = sc.nextInt();
		} while (n <= 0);
		
		
		triangleLB(n);
		System.out.println();
		
		triangleLU(n);
		System.out.println();
		
		triangleRB(n);
		System.out.println();
		
		triangleRU(n);
		System.out.println();
		
		sc.close();
	}	
}
