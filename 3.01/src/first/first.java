package first;

import java.util.Scanner;

//最后一个单词的长度
//
//给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
//
//单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。

public class first {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Solution S = new Solution();
		System.out.println(S.lengthOfLastWord(scan.nextLine()));

		scan.close();
	}
}

class Solution {
	public int lengthOfLastWord(String s) {
		if (s.length() == 0) {
			return 0;
		}

		else {
			String s1 = new StringBuffer(s).reverse().toString();
			int n = 0;

			while (s1.charAt(0) == ' ') {
				s1 = s1.substring(1);
			}

			if((n = s1.indexOf(" "))==-1)
				return s1.length();
			else
				return s1.substring(0, n).length();
		}
	}
}


//class Solution {
//	public int lengthOfLastWord(String s) {
//    	String[] strs = s.split(" ");  
//   	 return strs[strs.length -1].length();
//	}
//}
//利用字符串切片的方法，一个一个的都切开，是个好方法，而且速度快
//
//遍历字符串的三种方法，
//1. .length()	chatAt()
//2. .length()	subString(i,i+1)
//3. toCharArray()
//
//除了题目本生要考虑的东西外，首先就必须考虑，要寻找、判断的东西是否有不存在的情况。即特殊情况。