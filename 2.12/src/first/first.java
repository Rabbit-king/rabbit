package first;

import java.util.Scanner;

//罗马数字包含以下七种字符： I(1)， V(5)， X(10)， L(50)，C(100)，D(500) 和 M(1000)。
//给你一个整数，将其转为罗马数字。
//特殊情况
//I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900

public class first {
	public static void main(String[] args) {
		Solution S=new Solution();
		S.input();
		System.out.println(S.intToRoman(S.num));
	}
}

class Solution {
	int num = 0;
	int temp = 0;
	String s="";

	public void input() {
		System.out.println("请输入一个1到3999的数字");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
	}

	public String intToRoman(int num) {
		if (num < 1 || num > 3999) {
			System.out.println("输入错误");
			return null;
		}
		temp = num / 1000;
		num = num % 1000;
		for (int i = 0; i < temp; i++)
			s=s+"M";

		temp = num / 500;
		num = num % 500;
		for (int i = 0; i < temp; i++)
			s=s+"D";

		temp = num / 100;
		num = num % 100;
		for (int i = 0; i < temp; i++)
			s=s+"C";

		temp = num / 50;
		num = num % 50;
		for (int i = 0; i < temp; i++)
			s=s+"L";

		temp = num / 10;
		num = num % 10;
		for (int i = 0; i < temp; i++)
			s=s+"X";

		temp = num / 5;
		num = num % 5;
		for (int i = 0; i < temp; i++)
			s=s+"V";

		temp = num / 1;
		num = num % 1;
		for (int i = 0; i < temp; i++)
			s=s+"I";
		return s;
	}
}


//官方解答
//class Solution {
//    String[] thousands = {"", "M", "MM", "MMM"};
//    String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//    String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//    String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//
//    public String intToRoman(int num) {
//        StringBuffer roman = new StringBuffer();
//        roman.append(thousands[num / 1000]);
//        roman.append(hundreds[num % 1000 / 100]);
//        roman.append(tens[num % 100 / 10]);
//        roman.append(ones[num % 10]);
//        return roman.toString();
//    }
//}
//
//
//作者：LeetCode-Solution
//链接：https://leetcode-cn.com/problems/integer-to-roman/solution/zheng-shu-zhuan-luo-ma-shu-zi-by-leetcod-75rs/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。