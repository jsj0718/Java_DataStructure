package chap01.sum;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
	
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		sc.close();
	}

}
