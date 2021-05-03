package chap01.digit;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("2자리 정수를 입력하세요.");
		do {
			System.out.print("입력 : ");
			n = sc.nextInt();
		} while (n < 10 || n > 99);
		
		System.out.println("변수 n의 값은 " + n + "이 되었습니다.");
		
		sc.close();
	}

}
