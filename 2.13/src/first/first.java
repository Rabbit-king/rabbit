package first;

import java.util.Scanner;

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
//如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
//
//假设环境不允许存储 64 位整数（有符号或无符号）

public class first {
	int x = 0;

	public static void main(String[] args) {
		Solution S = new Solution();
		System.out.println("请输入一个数字");
		Scanner scan = new Scanner(System.in);
		System.out.println(S.reverse(scan.nextLong()));
		scan.close();
	}
}

class Solution {
	String Str = "";

	public int reverse(long x) {
		Str = x + "";
	
		if(x==0)
			return 0;
		
		
		Str = new StringBuffer(Str).reverse().toString();

		while(Str.indexOf("0")==0) {
			Str=Str.replaceFirst(Str.charAt(0)+"","");
		}
		if (Str.endsWith("-")) {
			Str = "-" + Str.replace(Str.charAt(Str.length() - 1) + "", "");
		}

		long n=Long.parseLong(Str);
		
		if((int)n!=n)
			return 0;
		else
			return (int)n;
	}
}

//算法很有问题，算学习字符串如何使用的吧，另外还需要学习 ?:的用法
//replace是替换所有的，replaceFirst替换第一个遇到的
//题目有说有溢出情况，需要考虑

//public int reverse(int x) {
//    long n = 0;
//    while(x != 0) {
//        n = n*10 + x%10;
//        x = x/10;
//    }
//    return (int)n==n? (int)n:0;
//}