package chap02.dimension;

import java.util.Scanner;

public class DayOfYearQ9 {
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},	// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31},	// 윤년
	};
	
	// 윤년 판단 (윤년 : 1 / 평년 : 0)
	static int isLeap(int year) {
		// 4로 나눠지면 윤년, 100으로 나눠지면 평년, 400으로 나눠지면 윤년
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int total = isLeap(y) == 1 ? 366 : 365;
		// month를 이용한 방식
		while (--m != 0) {
			d += mdays[isLeap(y)][m-1];
		}
		
		return total - d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그 해 경과 일 수를 구합니다.");
		int year;
		int month;
		int day;
		int retry;
		
		do {
			System.out.print("년 : "); year = sc.nextInt();
			System.out.print("월 : "); month = sc.nextInt();
			System.out.print("일 : "); day = sc.nextInt();

			System.out.println("그 해 남은 일 수는 " + dayOfYear(year, month, day) + "일 입니다.");
				
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");	
			retry = sc.nextInt();
		} while (retry == 1);
		
		sc.close();
	}
}
