package first;

//�������������������к�

public class first {
	public static void main(String[] args) {
		Solution s=new Solution();
		int a[]= {-2,0,31,5,-22,7,3,6,-15};
		System.out.println(s.MaxArray(a, a[0] , 1));
	}
	
}

class Solution {
	public int MaxArray(int a[],int dp,int index) {
		if(index>=a.length)
			return dp;
		
		if(dp<0)
			dp=0;
		int max=dp;
		dp=dp+a[index];
		max=Math.max(max, dp);
		return Math.max(max,MaxArray(a, dp, index+1));
	}
}