package MergeSorted;

public class test {
	public static void main(String[] args) {
		Merge m=new Merge();
		Integer[] a= {12,25,64,11,2,7,-10,3,-5,97,1,52,3};
	
		m.sort(a);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
