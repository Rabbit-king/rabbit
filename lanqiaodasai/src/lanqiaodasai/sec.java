package lanqiaodasai;


public class sec {
	public static void main(String[] args) {
		int n=0;
		
		for(int i=2022;i<=2022222022;i++) {
			int temp=0;
			int itemp=i;
			while(i>0) {
				temp+=i%10;
				i=i/10;
			}
			if(temp==itemp)
				n++;
		}
		System.out.println(n);
	}
}
