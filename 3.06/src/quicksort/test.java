package quicksort;

public class test {
	public static void main(String[] args) {
		quick q=new quick();
		Integer[] a= {1,22,56,5,16,7,91};
	
		q.sort(a);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
