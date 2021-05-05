package chap02.classExample;

import java.util.Scanner;

// 숫자 대신 *로 시력 분포 나타내기
public class PhysicalExaminationQ10 {

static final int VMAX = 21;		// 시력 분포 (0.0부터 2.0까지 0.1 단위로 21개)
	
	static class PhyscData {
		String name;	// 이름
		int height;		// 키
		double vision;	// 시력
		
		// 생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 평균 키 구하기
	static double aveHeight(PhyscData[] data) {
		double sum = 0;
		
		for (int i=0; i<data.length; i++) {
			sum += data[i].height;
		}
		
		return sum / data.length;
	}
	
	// 시력 분포 구하기
	static void distVision(PhyscData[] data, int[] dist) {
		
		// 내 풀이 (난해함)
//		for (int i=0; i<VMAX; i++) {
//			// null값인 항목을 빈칸으로 대체
//			if (dist[i] == null) {
//				dist[i] = "";
//			}
//		}
		
		for (int i=0; i<data.length; i++) {
			// 시력이 해당 범위 안에 있는 경우
			if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0) {
				// 0.0이면 0번 인덱스, 0.1이면 1번 인덱스 ...의 값을 증가시킨다.
				dist[(int)(data[i].vision * 10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("마성지", 152, 0.0),
				new PhyscData("박현규", 162, 0.0),
				new PhyscData("채치수", 193, 0.0),
				new PhyscData("정대만", 183, 0.1),
				new PhyscData("권준호", 178, 0.1),
				new PhyscData("송태섭", 167, 0.2),
				new PhyscData("강백호", 189, 0.2),
				new PhyscData("서태웅", 187, 0.3),
		};
		int[] vdist = new int[VMAX];
		
		System.out.println("- 신체검사 리스트 -");
		System.out.println("이름       키   시력");
		System.out.println("-----------------");
		
		for (int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f ~ %3.1f : ", i/10.0 , (i+1)/10.0);
			// 책 풀이 (반복문을 통해 해결)
			for (int j=0; j<vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
