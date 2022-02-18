package first;

import java.util.Scanner;

//����һ���ַ��� s �������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�

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


//��Ŀ�����ˣ���û���ظ��ַ����ִ������ǲ��ԳƵ��ִ�


class Solution {
    public int lengthOfLongestSubstring(String s) {
        // ��¼�ַ���һ�γ��ֵ�λ��
        int[] last = new int[128];//Ϊʲô����128�����飬����Ϊ�ַ�ֻ��128��
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;//���ؽ��
        int start = 0; // �ִ���ʼ��λ��
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);//ѡ����ַ��ϴγ��ֵ�λ�ã��������һλ
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}

//�ַ�char ֻ��128��������㷨��˼������һ��128�������¼������ÿ���ַ����ֵ�λ�ã�
//һ��ʼ���ǳ�ʼ��Ϊ-1��Ȼ���¼�����ַ����ĵڼ���λ�ã�����ڳ��֣��Ǵ��ϴγ��ֵ�λ�ã������һλ