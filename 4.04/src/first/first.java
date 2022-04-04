package first;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//����һ���ַ��� s ��һ���ַ����б� wordDict ��Ϊ�ֵ䡣�����ж��Ƿ���������ֵ��г��ֵĵ���ƴ�ӳ� s ��
//ע�⣺��Ҫ���ֵ��г��ֵĵ���ȫ����ʹ�ã������ֵ��еĵ��ʿ����ظ�ʹ�á�


public class first {
	public static void main(String[] args) {
		Solution s=new Solution();
		List<String> l=new LinkedList<String>();
		l.add("cats");
		l.add("dog");
		l.add("sand");
		l.add("and");
		l.add("cat");
		System.out.println(s.wordBreak("catsandog",l));
	}
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
		//�Ȱ�����ĸƥ��
    	//ʣ�µĲ���������ĸƥ��
    		
    	while(s.length()>0) {
    		int k=0;
    		for(String a:wordDict) {
    			if(a.length()>s.length())
    				continue;
    			String temp=s.substring(0, a.length());
    			if(temp.equals(a)) {
    				s=s.substring(a.length());
    				k++;
    				break;
    			}
    		}
    		if(k==0)
    			return false;
    	}
    	return true;
    }
}

//����Ҫѧ�ᶯ̬�滮

//0ms���
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        if (s.length() == 0) return true;
//        if (s.length() >= 150) return false;
//        for (int i = 0; i < wordDict.size(); i++) {
//            if (s.startsWith(wordDict.get(i))) {
//                if (wordBreak(s.substring(wordDict.get(i).length()), wordDict)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}