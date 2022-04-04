package Heapsort;

public class test {
	public static void main(String[] args) {
		Integer a[]= {2,77,1,20,70,5,11,2,63,4};
		Heapsort<Integer> hs=new Heapsort<Integer>(a); 
		
		hs.BeHeap();
		
		hs.print();
	}
}
