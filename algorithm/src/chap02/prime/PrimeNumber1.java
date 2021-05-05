package chap02.prime;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int count = 0;
		
		for (int n=2; n<=1000; n++) {
			int i;
			for (i=2; i<n; i++) {
				count ++;
				// 자신 이외의 수에게 나누어 떨어지면 소수가 아님
				if (n % i == 0) {
					break;
				}
			}
			// 자기 자신에게만 나누어 떨어진다면 소수에 해당하므로 출력
			if (n == i) {
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + count);
	}

}
