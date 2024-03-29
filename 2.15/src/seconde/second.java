package seconde;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
//找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//返回容器可以储存的最大水量。

public class second {
	public static void main(String[] args) {
		Solution S=new Solution();
		
		int n=0;
		System.out.println("输入数组");
		Scanner scan=new Scanner(System.in);
		
		n=scan.nextInt();
			
		int[] A=new int[n];

		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		scan.close();
		
		System.out.println(S.maxArea(A));
	}
}

class Solution {
    public int maxArea(int[] height) {
		int M=0;
		int right=1;
		int left=0;
		
		if(height.length<2) {
			return 0;
		}
		else {
			while(left<height.length-1)
			{
				while(right<height.length) {
					M=Math.max(M, (Math.min(height[right], height[left]))*(right-left));
					right++;
				}
				left++;
				right=left+1;
			}
			return M;
		}	
    }
}

//超时


//public int maxArea(int[] height) {
//    int max = 0;
//    int l =0, r = height.length - 1;
//    while (l < r) {
//        int min = Math.min(height[l], height[r]);
//
//        int temp = min * (r - l);
//
//        max = Math.max(max, temp);
//
//        // 快速跳过
//        while (height[l] <= min && l < r) {
//            ++l;
//        }
//
//        while (height[r] <= min && l < r) {
//            --r;
//        }
//    }
//    return max;
//}