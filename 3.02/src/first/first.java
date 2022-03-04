package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Solution S = new Solution();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.print(S.generate(n));

	}
}

class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		int c = 0;

		for (int i = 0; i < numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			if (i == 0) {
				temp.add(1);
				list.add(temp);

			} else {
				c = 1;
				for (int j = 0; j <= i; j++) {
					if (j == 0)
						temp.add(1);
					else {
						c = (c * (i - j + 1)) / j;
						// ���һ����Ӧ����1����ȴ��0
						temp.add(c);
					}
				}

				list.add(temp);

			}

		}
		return list;
	}
}
//cҪ���ڶԵĵط���add(�б�)������б��ù��Ͳ��ܸ��ˣ���Ϊadd()�ǵ�ַ

//List��add()���ӵ��ǵ�ַ(����)��������ֵ����һ��һ��Ҫע��

//�ٷ���
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ret = new ArrayList<List<Integer>>();
//        for (int i = 0; i < numRows; ++i) {
//            List<Integer> row = new ArrayList<Integer>();
//            for (int j = 0; j <= i; ++j) {
//                if (j == 0 || j == i) {
//                    row.add(1);
//                } else {
//                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
//                }
//            }
//            ret.add(row);
//        }
//        return ret;
//    }
//}