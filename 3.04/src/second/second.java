package second;

public class second {
	public static void main(String[] args) {
		selected s=new selected();
		
		int[] a= {2,6,44,8,1,68,5};
		
		a=s.selectedchanged(a);
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

class selected{
	public int[] selectedchanged(int a[]) {
		int min=0;
		int min_index=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			min=a[i];
			min_index=i;
			for(int j=i;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					min_index=j;
				}
			}
			temp=a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}	
		return a;
	}
}