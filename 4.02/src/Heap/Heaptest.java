package Heap;

public class Heaptest {
	public static void main(String[] args) {
		Heap<Integer> h = new Heap<Integer>(20);
		h.add(2);
		h.add(8);
		h.add(15);
		h.add(1);
		h.add(8);
		h.add(9);
		h.add(30);
		
		h.delete(15);
		
		h.print();
	}

}
