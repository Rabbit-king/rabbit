package lanqiaodasai;

public class first {
	public static void main(String[] args) {
		int bas=1;//20^22次方的基数
		
		for(int i=0;i<22;i++) {
			bas=bas*20;
			if(bas>=7) {
				bas=bas%7;
			}
		}
		System.out.println(bas);
	};
	
	
}
