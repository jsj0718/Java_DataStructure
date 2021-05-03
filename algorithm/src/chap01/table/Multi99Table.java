package chap01.table;

public class Multi99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		System.out.println("-----곱셉표-----");
		for (i=1; i<=9; i++) {
			for (j=1; j<=9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}

}
