package quicksort;
//��������ϰ ��ɣ�����
public class quicksort<T extends Comparable<T>> {
	public T[] quicksort(T[] date) {
		return quicksort(date, 0, date.length - 1);
	}

	public T[] quicksort(T[] date, int left, int right) {
		if(left>=right)
			return null;
		
		T key = date[left];
		int l = left;
		int r = right;

		while (l < r) {
			while ((date[r].compareTo(key) >= 0) && l < r) {
				r--;
			}
			while (date[l].compareTo(key) <= 0 && l < r) {
				l++;
			}

			if (l < r) {
				T temp = date[r];
				date[r] = date[l];
				date[l] = temp;
			}
		}

		T temp=date[r];
		date[r]=date[left];
		date[left]=temp;
		
		
		quicksort(date, left, r - 1);
		quicksort(date, r + 1, right);

		return date;
	}
	public static void main(String[] args) {
		Integer[] a = { 2, 5, -5, 66, 7, 11, 1, 1, 1, 6, 2 };
		quicksort<Integer> q=new quicksort<Integer>();
		for(int i:q.quicksort(a)) {
			System.out.print(i+" ");
		}
	}
}
