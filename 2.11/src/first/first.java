package first;

import java.util.Scanner;
import java.util.Stack;

//����ƥ��
public class first {
	public static void main(String[] args) {
		String s = "";
		System.out.println("�����������ַ���");

		Scanner scan = new Scanner(System.in);

		s = scan.nextLine();
		scan.close();
		Solution Slt = new Solution();
		if (Slt.isValid(s))
			System.out.println("True");
		else
			System.out.println("False");
	}
}

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stc = new Stack<>();
		// ����һ��ջ
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stc.push(s.charAt(i));
			} else {
				if (s.charAt(i) == ']') {
					if (stc.peek() == '[') {
						stc.pop();
					}
				}
				if (s.charAt(i) == '}') {
					if (stc.peek() == '{') {
						stc.pop();
					}
				}
				if (s.charAt(i) == ')') {
					if (stc.peek() == '(') {
						stc.pop();
					}
				}
			}
		}
		if (stc.empty())
			return true;
		else
			return false;
	}
}