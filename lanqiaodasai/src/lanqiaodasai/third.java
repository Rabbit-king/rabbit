package lanqiaodasai;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		int n[]=new int[26];
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char c[]=s.toCharArray();
		scan.close();
		for(char a:c) {
			n[a%65]++;
		}
		
		int max=0;
		for(int i:n) {
			max=max<i?i:max;
		}
		
		for(int i=0;i<26;i++) {
			if(n[i]==max) {
				System.out.print((char)(i+65));
			}
		}
	}
}
