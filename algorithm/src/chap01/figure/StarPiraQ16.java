package chap01.figure;

import java.util.Scanner;

public class StarPiraQ16 {

	static void spira(int n) {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i+1; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=(i-1)*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("n단의 피라미드를 구합니다.");
		do {
			System.out.println("몇 단 입니까?");
			System.out.print("단 수 : ");
			n = sc.nextInt();
		} while (n<=0);
		
		spira(n);
		
		sc.close();
	}

}
