package chap01.sum;

public class SumForQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		int sum = 0;
		
		for (int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합계는 " + sum + "입니다.");
	}

}
