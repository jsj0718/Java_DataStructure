package chap02.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i=1; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();	// nextInt(n)은 0부터 n-1까지 랜덤으로 출력
		int n;
		
		
		System.out.println("키의 최대값을 구합니다.");
		do {
			System.out.print("사람 수 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int[] height = new int[n];
		for (int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);	// rand의 nextInt(90)은 0~89까지 랜덤으로 출력
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		
		sc.close();
	}
}
