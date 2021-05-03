package chap01.median;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : "); int n = sc.nextInt();
		if(n > 0) {
			System.out.print("이 수는 양수입니다.");
		} else if(n < 0) {
			System.out.print("이 수는 음수입니다.");
		} else {
			System.out.print("이 수는 0 입니다.");
		}
		
		sc.close();
	}

}
