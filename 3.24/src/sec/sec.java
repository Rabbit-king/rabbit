package sec;

public class sec {
	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<2022;i++) {
			if((4042%i==0)&&(2021%i!=0))
				n++;
		}
		
		System.out.println(n);
	}
}
