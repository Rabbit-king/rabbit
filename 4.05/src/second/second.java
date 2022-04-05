package second;

//����һ�������Ǹ������� m x n ���� grid �����ҳ�һ�������Ͻǵ����½ǵ�·����ʹ��·���ϵ������ܺ�Ϊ��С��
//˵����ÿ��ֻ�����»��������ƶ�һ����

public class second {
	public static void main(String[] args) {
		Solution s=new Solution();
		int grid[][]= {{1,5,6,7},{2,8,0,4},{4,1,2,3}};
		System.out.println(s.minPathSum(grid));
	}
}

class Solution {
	public int minPathSum(int[][] grid) {
		int i = 0;
		int j = 0;

		return minpath(grid, i, j);
	}

	public int minpath(int[][] grid, int i, int j) {
		int imax = grid.length - 1;
		int jmax = grid[0].length - 1;
		int isum = 0;
		int jsum=0;
		
		if (i >= imax && j >= jmax)
			return grid[i][j];
		if (i >= imax) 
			return grid[i][j] + minpath(grid, i, j + 1);
		if (j >= jmax) 
			return grid[i][j] + minpath(grid, i + 1, j);

		if (i < imax && j < jmax) {
			isum=grid[i][j]+minpath(grid,i+1,j);
			jsum=grid[i][j]+minpath(grid,i,j+1);
		}
		return isum<jsum?isum:jsum;
	}
}

//�õݹ�ᱬջ������Ҫѧ����ѭ���ķ�ʽ�����ߣ�ѭ��-�ݹ黥����
