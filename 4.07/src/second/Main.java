package second;

//���ű�
//С��ϣ�����еĻ������հڳ�һ����ĳ����塣���ڳ��������ߵķ�����
//�ֱ�� L��W��H �Ļ������ n = L �� W �� H��


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		long n = 2021041820210418l;

		List<Long> list = new ArrayList<>();
		// ������
		for (long i = 1; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				list.add(i);
				//��ֹ����2��2����4��������2���ӵ��б�
				if ((n / i) != i)
					list.add(n / i);
			}
		}
		
		int count = 0;
		// ����
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				for (int k = 0; k < list.size(); k++) {
					if (list.get(i) * list.get(j) * list.get(k) == n) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}