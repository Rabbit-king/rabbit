package Insert_Sort;

public class Insert_Sort {
	public static void main(String[] args) {
		int[] a = {  44,1, 2, 6,70,5, 6, 90, 7, 44};

		sort_In s = new sort_In();

		s.print(s.insert(a));
	}
}

class sort_In {
	public int[] insert(int[] a) {
		int temp = 0;

		for (int i = 1; i < a.length; i++) {
			for (int j =i; j > 0; j--) {
				if (a[j] < a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				} else
					break;

			}
		}

		return a;
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}


//�����������ѧ˼���ð�ݲ�ͬ��ð�ݵ�˼���� x1 < x2 < x3 < ��������,��Ϊ������Ҫ���ڵ�����һһ�Ƚϡ�
//�������������ǰѴ�����������η����������ָ��λ�þ��С�