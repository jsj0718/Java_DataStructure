package chap02.classExample;

import java.util.Scanner;

public class YMD_Q11 {
	int y;		// 년
	int m;		// 월
	int d;		// 일
	
	// 생성자 함수
	YMD_Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},	// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31},	// 윤년
	};
	
	// 윤년, 평년 판단 메소드
	static int isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? 1 : 0);
	}
	
	YMD_Q11 after(int n) {
		YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);
		
		if (n < 0) {
			before(-n);
		}
		
		temp.d += n;
		
		while (temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m-1];
			if (++temp.m > 12) {
				temp.m = 1;
				temp.y++;
			}
		}
		return temp;
	}
	
	YMD_Q11 before(int n) {
		YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);
		
		if (n<0) {
			after(-n);
		}
		
		temp.d -= n;
		
		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.m = 12;
				temp.y--;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m-1];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		int m;
		int d;
		int n;
		
		System.out.println("날짜를 입력하세요.");
		System.out.print("년 : ");	y = sc.nextInt();
		System.out.print("월 : ");	m = sc.nextInt();
		System.out.print("일 : ");	d = sc.nextInt();
		
		YMD_Q11 date = new YMD_Q11(y, m, d);
		
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요? : ");	n = sc.nextInt();
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, date.after(n).y, date.after(n).m, date.after(n).d);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, date.before(n).y, date.before(n).m, date.before(n).d);
		
		sc.close();
		
	}

}
