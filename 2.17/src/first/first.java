package first;

import java.util.Scanner;

//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

public class first {
	public static void main(String[] args) {
		Solution S = new Solution();
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		scan.close();
		System.out.println(S.isPalindrome(x));
	}
}

class Solution {
	public boolean isPalindrome(int x) {
		int temp=x;
		long y = 0;
		if (x < 0)
			return false;
		else {
			while (x != 0) {
				y = y * 10 + x % 10;
				x = x / 10;
			}
		}

		if (temp == y)
			return true;
		else
			return false;
	}
}
//击败了80%的时间消耗，5ms，4ms算法是只计算后一半
//如下:
//class Solution {
//    public boolean isPalindrome(int x) {
//        if(x<0||x%10==0&&x!=0){return false;}
//int r=0;
//while(r<x){
//    r=r*10+x%10;
//    x=x/10;
//}
//return (r==x||r/10==x);
//
//    }
//}