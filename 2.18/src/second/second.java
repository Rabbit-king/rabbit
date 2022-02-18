package second;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		int m=0;
		int n=0;
		
		Scanner scan=new Scanner(System.in);
		
		m=scan.nextInt();
		n=scan.nextInt();
		
		int[] A=new int[m];
		int[] B=new int[n];
		
		for(int i=0;i<m;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println("输入heaters[]");
		for(int i=0;i<n;i++) {
			B[i]=scan.nextInt();
		}
		scan.close();
		
		solu s=new solu();
		System.out.println(s.findRadius(A, B));
		
	}
}

class solu{
	public static int findRadius(int[] houses, int[] heaters) {
		
		int res=0;//最终结果，是所有最小里的最大的
		
		for(int i=0;i<houses.length;i++) {
			int temp=Integer.MAX_VALUE;//记录每个房子最靠近的取暖器的距离
			
			for(int j=0;j<heaters.length;j++) {
				temp=Math.min(temp, Math.abs(houses[i]-heaters[j]));
			}
			res=Math.max(res,temp);
		}
		return res;
	}
}

//用时1630ms，思路是从房子去找最近的取暖器，最后找出最小的当中的最大值，就这还能击败5%？？？