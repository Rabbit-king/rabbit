package quicksort;

public class quick {
	public boolean less(Comparable w, Comparable v) {
		return w.compareTo(v) < 0;
	}

	public void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public void sort(Comparable[] a) {
		int low = 0;
		int height = a.length - 1;

		sort(a, low, height);
	}

	public void sort(Comparable[] a, int low, int height) {
		if (low >= height)
			return;

		int par = par(a, low, height);
		sort(a, low, par - 1);
		sort(a, par + 1, height);
	}

	// 有越界问题
	public int par(Comparable[] a, int low, int height) {
		int left = low;
		int right = height + 1;
		Comparable key = a[low];

		while (left < right) {
			//这个--和++对边界的影响要再理解
			while (less(key, a[--right]) && left < right)
			while (less(a[++left], key) && left < right) 
			if (left < right)
				exch(a, left, right);
		}
		//必须交换的是right，因为这个算法并不是left=right;
		//为什么是right呢？因为小的要放到左边，寻找比key小的是右边指针的事。
		exch(a, low, right);
		return left;
	}
}
