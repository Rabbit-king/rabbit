package third;

import java.util.Scanner;

//������������¥�ݡ���Ҫ n ������ܵ���¥����
//
//ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

public class third {
	public static void main(String[] args) {
		Solution S=new Solution();
		Scanner scan=new Scanner(System.in);
		System.out.println(S.climbStairs(scan.nextInt()));
		
		scan.close();
	}
}

class Solution {
	public long climbStairs(int n) {
		int x = n / 2;
		long count = 0;

		while (x >= 0) {
			count += C(n - x, x);
			x--;
		}

		return count;
	}

	public long C(int m, int x) {
		long re = 1;

		if (x == 0)
			return 1;
		for (int i = 0; i < x; i++) {
			re = re * (m - i) / (i + 1);
		}

		return re;
	}
}

//int�ͻ���������Ըĳ�long�����ύ�𰸱�����int�ͣ�Ϊ��