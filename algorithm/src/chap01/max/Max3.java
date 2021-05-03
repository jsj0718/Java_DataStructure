package chap01.max;
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a = "); int a = stdIn.nextInt();
		System.out.print("b = "); int b = stdIn.nextInt();
		System.out.print("c = "); int c = stdIn.nextInt();
		
		// 순차적 구조로 진행(문장이 순서대로 진행)
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		
		System.out.println("최대값 : " + max);
		
		stdIn.close();
	}

}
