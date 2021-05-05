package chap02.array;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 52;
		a[3] = 12;
		a[4] = a[1] * 2;
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

}
