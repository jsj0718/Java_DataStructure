package chap01.sum;

import java.util.Scanner;

public class SumGaussQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 값 : "); int n = sc.nextInt();
		
		int sum = (1 + n) * n / 2;
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		sc.close();
	}

}
