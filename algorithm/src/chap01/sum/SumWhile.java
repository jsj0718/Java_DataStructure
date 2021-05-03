package chap01.sum;

import java.util.Scanner;

public class SumWhile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		System.out.print("n의 값 : "); int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		System.out.println("i의 값은 " + i + "입니다.");
		
		sc.close();
	}

}
