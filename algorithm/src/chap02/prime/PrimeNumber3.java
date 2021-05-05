package chap02.prime;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int count = 0;					// 곱셈과 나눗셈 연산 횟수
		int ptr = 0;					// 찾은 소수 개수
		int[] prime = new int[500];		// 소수를 저장하는 배열
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for (int n=5; n<=1000; n+=2) {
			boolean flag = false;
			for (int i=1; prime[i] * prime[i] <= n; i++) { 
				count += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				count++;
				prime[ptr++] = n;
			}
		}
		
		for (int i=0; i<ptr; i++) {
			System.out.println(prime[i]);			
		}
		System.out.println("나눗셈 횟수 : " + count);
	}

}
