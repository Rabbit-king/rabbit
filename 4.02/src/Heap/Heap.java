package Heap;

public class Heap<T extends Comparable<T>> {
	Comparable<T> data[] = null;
	int N = 0;

	public Heap(int x) {
		data = new Comparable[x];
	}

	public int size() {
		return N;
	}

	public void exchange(int i, int j) {
		Comparable<T> temp;
		temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public boolean less(Comparable<T> w, Comparable<T> v) {
		return w.compareTo((T) v) < 0;
	}

	public void add(Comparable<T> d) {
		data[++N] = d;
		if (N > 1)
			swim();
	}

	public void swim() {
		int k = N;
		while (k > 1) {
			if (less(data[k / 2], data[k])) {
				exchange(k / 2, k);
			}
			else
				break;
			k=k/2;
		}
	}
	
	public Comparable<T> delete(Comparable<T> d) {
		for(int i=1;i<=N;i++) {
			if(data[i]==d) {
				data[i]=data[N];
				N--;
				sink(i);
				return  data[N+1];
			}
		}
		return null;
	}

	public void sink(int i) {
		while(i<=N) {
			//如果2*i或者2*i+1这两个位置的值都没有，那就没必要比较了
			if(2*i>N||2*i+1>N)
				return ;
			if(less(data[2*i],data[i])&&less(data[2*i+1],data[i])) {
				return ;
			}
			else {
				if(less(data[i],data[2*i])) {
					exchange(i, 2*i);
					i=2*i;
				}
				else{
					exchange(i, 2*i+1);
					i=2*i+1;
				}
			}
		}
	}
	
	public void print() {
		for(int i=1;i<=N;i++) {
			System.out.print(data[i]+" ");
		}
	}
}
//数组或者其他数据结构中，只要比较，就必须保证这两个值存在
