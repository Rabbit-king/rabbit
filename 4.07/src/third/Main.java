package third;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
 
public class Main{  
    public static void main(String[] args){
    	int count = 0;
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();//long������ͨ������̨��ֵ
    	HashSet<Long> set = new HashSet<>();
        //�ҳ�n�����й����ӣ���ÿ��forѭ���󣬸���mdֵ��Сforѭ������
        long md = n;
    	for(long i=1;i<=md;i++){
    		if(n%i == 0){
    			md = n/i;
    			set.add(md); 
    			set.add(i);
    		}
    	}
        //Ƕ��3��������ҳ�����Ҫ��Ľ��
    	Iterator it1 = set.iterator();
    	while(it1.hasNext()){
    		long x = (long)it1.next(); 
    		Iterator it2 = set.iterator();
    		while(it2.hasNext()){
    			long y = (long)it2.next(); 
        		Iterator it3 = set.iterator();
        		while(it3.hasNext()){
        			long z = (long)it3.next(); 
        			if(x*y*z==n){  //�ж�x*y*z�Ƿ�Ϊn
        				count++;
        			}
        		}
    	    }
    	}
    	//������ս��
    	System.out.println(count);   	
    }
}