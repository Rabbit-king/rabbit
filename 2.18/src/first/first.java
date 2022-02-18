package first;

import java.util.Scanner;

//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

public class first {
public static void main(String[] args) {
	Solution S=new Solution();
	Scanner scan=new Scanner(System.in);
	
	System.out.println(S.lengthOfLongestSubstring(scan.nextLine()));
	scan.close();
}
}

//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//    	if(s.length()<=1) {
//    		return s.length();
//    	}
//    	
//    	int num=s.length();
//    	int max=1;
//    	for(int i=0;i<num;i++) {
//    		for(int j=i+1;j<=num;j++) {
//    			String s2=s.substring(i, j);
//    			String s1=new StringBuffer(s2).reverse().toString();
//    			if(!s1.equals(s2)) {
//    				if(max<s2.length())
//    					max=s2.length();
//    			}
//    		}
//    	}
//    	
//    	return max;
//    }
//}


//题目看错了，是没有重复字符的字串，不是不对称的字串


class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];//为什么创建128的数组，是因为字符只有128个
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;//返回结果
        int start = 0; // 字串开始的位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);//选这个字符上次出现的位置，再向后移一位
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}

//字符char 只有128个，这个算法的思想是用一个128的数组记录出现了每个字符出现的位置，
//一开始都是初始化为-1，然后记录是在字符串的第几个位置，如果在出现，那从上次出现的位置，向后移一位