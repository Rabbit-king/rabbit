package first;

import java.util.Scanner;

//���һ�����ʵĳ���
//
//����һ���ַ��� s�������ɵ�����ɣ�����ǰ����һЩ�ո��ַ������������ַ��������һ�����ʵĳ��ȡ�
//
//���� ��ָ������ĸ��ɡ��������κοո��ַ���������ַ�����

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
//�����ַ�����Ƭ�ķ�����һ��һ���Ķ��п����Ǹ��÷����������ٶȿ�
//
//�����ַ��������ַ�����
//1. .length()	chatAt()
//2. .length()	subString(i,i+1)
//3. toCharArray()
//
//������Ŀ����Ҫ���ǵĶ����⣬���Ⱦͱ��뿼�ǣ�ҪѰ�ҡ��жϵĶ����Ƿ��в����ڵ�����������������