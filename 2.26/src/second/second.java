package second;

import java.util.Scanner;

//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
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

//ͨ���������Ǻ�ʱ���Ǻ��ڴ涼�Ƚϴ�

//repalce() ��replaceAll() ��������replaceAll()֧���������ʽ