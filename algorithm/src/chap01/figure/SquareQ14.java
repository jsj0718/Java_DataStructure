package chap01.figure;

import java.util.Scanner;

public class SquareQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("사각형을 출력합니다.");
		
		do {
			System.out.print("단수 : "); 
			n = sc.nextInt();			
		} while (n <= 0);
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
