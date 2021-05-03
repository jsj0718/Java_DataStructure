package chap01.sum;

import java.util.Scanner;

public class SumMethodQ9 {
	
	static int sumof(int a, int b) {
		int min, max;
		if (a > b) {
			max = a;
			min = b;
		} else {
			min = a;
			max = b;
		}
		
		int sum = 0;
		for (int i=min; i<=max;i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : "); int a = sc.nextInt();
		System.out.print("b의 값 : "); int b = sc.nextInt();
		System.out.println(a + "부터 " + b + "까지의 합계 : " + sumof(a, b));
		sc.close();
	}

}
