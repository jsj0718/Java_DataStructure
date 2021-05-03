package chap01.figure;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		do {
			System.out.println("면 단 삼각형입니까?");
			System.out.print("단 수 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		// 파이썬과 다르게 문자열 반복이 안되므로 이중 반복문을 이용한다.
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
