package chap01.digit;

import java.util.Scanner;

public class DigitNoQ11 {

// 내 풀이
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("양의 정수 n : "); String n = sc.next();
//		int num = Integer.parseInt(n);
//		
//		if (num <= 0) {
//			System.out.println("양의 정수가 아닙니다.");
//		} else {
//			int result = n.length();
//			System.out.println(n + "의 자리수는 " + result + "입니다.");			
//		}
//		
//		
//		sc.close();
//	}

//	정답 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 구합니다.");
		int n;
		do {
			System.out.print("양의 정수 n : "); 
			n = sc.nextInt();
		} while (n <= 0);
		
		// 자리수
		int result = 0;
		while (n > 0) {
			n /= 10;
			result++;
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
}

