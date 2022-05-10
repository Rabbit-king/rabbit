package first;

import java.util.Scanner;

public class mo {
	public static void main(String[] args) {
		int[] a = new int[10];
		int count = 0;
		int min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			if (a[i] < min) {
				min = a[i];
				count = 0;
			} 
			if(a[i]==min) {
				count++;
			}
		}
		sc.close();
		System.out.println(min + "	" + count);
	}
}
