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


//插入排序的数学思想和冒泡不同，冒泡的思想是 x1 < x2 < x3 < ····,因为，是需要相邻的两个一一比较。
//而插入排序则是把待排序的数依次放入已排序的指定位置就行。