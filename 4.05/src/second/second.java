package second;

//给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
//说明：每次只能向下或者向右移动一步。

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

//用递归会爆栈，还是要学会用循环的方式。或者，循环-递归互换。
