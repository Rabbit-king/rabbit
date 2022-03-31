package thd;

import java.util.HashSet;

public class thd {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		int[] da=new int[45];
		for (int i = 0; i <= 44; i++) {
			da[i]=i*i;
		}
		
		for(int i=0;i<=44;i++) {
			for(int j=0;j<=i;j++) {
				if((da[i]+da[j])>2021)
					break;
				else
					set.add(da[i]+da[j]);
			}
		}
		
		System.out.println(set.size()-1);
	}
}
