package first;

import java.util.Scanner;

//Ҫ���û�����16����������û������������32����Ҫ����������

public class first {
	public static void main(String[] args) {
		int a[] = new int[16];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			while(a[i]>32) {
				System.out.println("����������");
				a[i]=s.nextInt();
			}
		}
		s.close();
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}