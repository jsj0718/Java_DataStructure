package chap02.prime;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int count = 0;
		int ptr = 0; 				// 소수의 개수
		int[] prime = new int[500]; // 소수 배열
		
		prime[ptr++] = 2;
		// 홀수만 탐색 (짝수는 2로 나눠지기 때문에 소수가 아님)
		for (int n=3; n<=1000; n+=2) {
			int i;
			for (i=1; i<ptr; i++) {
				count++;
				if (n % prime[i] == 0) {
					break;
				}
			}
			if (i == ptr) {
				prime[ptr++] = n;
			}
		}
		
		for (int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈 횟수 : " + count);
	}

}
