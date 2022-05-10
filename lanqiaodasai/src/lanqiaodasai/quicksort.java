 package lanqiaodasai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class quicksort{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] dp=new int[n];
		int[] dp1=new int[n];
		for(int i=0;i<n;i++) {
			dp[i]=Integer.parseInt(s[i]);
			dp[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(dp1);
		
		int key=dp[n/2];
		int[] res=new int[n];
		
		for(int i=0;i<n;i++) {
			if(key>dp[i]) {
				res[i]=key-dp[i]+1;
				dp1[i]=Integer.parseInt(s[i]);
			}
		}
		
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	 
	 
 }