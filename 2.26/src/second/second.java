package second;

import java.util.Scanner;

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
public class second {
	public static void main(String[] args) {
		Solution S=new Solution();
		Scanner scan =new Scanner(System.in);
		
		String s=scan.nextLine();
		
		System.out.println(S.isPalindrome(s));
		
		scan.close();
	}
}

class Solution {
	public boolean isPalindrome(String s) {
		for (int i = 0; i < 128; i++) {
			char j = (char) i;
			if (!(('0' <= j && j <= '9') || ('a' <= j && j <= 'z') || ('A' <= j && j <= 'Z'))) {
				s = s.replace(j + "", "");
			}
		}

		String s1 = new StringBuffer(s).reverse().toString();

		if (s.equalsIgnoreCase(s1)) {
			return true;
		} else {
			return false;
		}
	}
}

//通过，如论是耗时还是耗内存都比较大

//repalce() 和replaceAll() 的区别是replaceAll()支持正则表达式