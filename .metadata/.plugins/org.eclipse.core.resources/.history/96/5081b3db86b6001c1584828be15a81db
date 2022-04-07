package third;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
 
public class Main{  
    public static void main(String[] args){
    	int count = 0;
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();//long型数据通过控制台赋值
    	HashSet<Long> set = new HashSet<>();
        //找出n的所有公因子，在每次for循环后，根据md值缩小for循环次数
        long md = n;
    	for(long i=1;i<=md;i++){
    		if(n%i == 0){
    			md = n/i;
    			set.add(md); 
    			set.add(i);
    		}
    	}
        //嵌套3层迭代器找出符合要求的结果
    	Iterator it1 = set.iterator();
    	while(it1.hasNext()){
    		long x = (long)it1.next(); 
    		Iterator it2 = set.iterator();
    		while(it2.hasNext()){
    			long y = (long)it2.next(); 
        		Iterator it3 = set.iterator();
        		while(it3.hasNext()){
        			long z = (long)it3.next(); 
        			if(x*y*z==n){  //判断x*y*z是否为n
        				count++;
        			}
        		}
    	    }
    	}
    	//输出最终结果
    	System.out.println(count);   	
    }
}