package first;
//ð������
public class maopao {
	public static void main(String[] args) {
		mp m=new mp();
		int[] a= {1,5,6,8,10,2,77,15};
		a=m.maopao(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

class mp{
	public int[] maopao( int a[]) {
		int k=0;	
		int temp=0;
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {	
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					k++;
					
				}
			}
			//���for�����㷨����
			
			if(k==0)
				break;
		}
		
		return a;
	}
}

//ʱ�临�Ӷ� O(n^2)	�ռ临�Ӷ� O(1)