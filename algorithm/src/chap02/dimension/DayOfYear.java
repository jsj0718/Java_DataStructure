package chap02.dimension;

import java.util.Scanner;

public class DayOfYear {

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
		int days = d;	// 일수
		
		for (int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];	// 평년인지 윤년인지 결정 후 1월~(m-1)월까지 일수를 더함
		}
		
		return days;
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

			System.out.println("그 해 " + dayOfYear(year, month, day) + "일째 입니다.");
				
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");	
			retry = sc.nextInt();
		} while (retry == 1);
		
		sc.close();
	}

}
