package MergeSorted;

public class Merge {
	public static Comparable[] assist;

	// �Ƚ�
	public boolean compare(Comparable w, Comparable v) {
		return w.compareTo(v) < 0;
	}

	// ����
	public void exch(Comparable[] a, int i, int j) {
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sort(Comparable[] a) {
		assist = new Comparable[a.length];

		int low = 0;
		int height = a.length - 1;

		sort(a, low, height);
	}

	public void sort(Comparable[] a, int low, int height) {
		if (low >= height)
			return;

		int mid = low + (height - low) / 2;

		sort(a, low, mid);
		sort(a, mid + 1, height);

		merge(a, low, mid, height);

	}

	public void merge(Comparable[] a, int low, int mid, int height) {
		int left = low;
		int right = mid+1;
		int middle = low;

		while (left <= mid || right <= height) {
			if (compare(a[left], a[right])) {
				assist[middle++] = a[left++];
			} else {
				assist[middle++] = a[right++];
			}
			if (left > mid)
				while (right <= height)
					assist[middle++] = a[right++];
			if (right > height)
				while (left <= mid)
					assist[middle++] = a[left++];
		}
		for(int index=low;index<=height;index++) {
			a[index]=assist[index];
		}
	}
}
