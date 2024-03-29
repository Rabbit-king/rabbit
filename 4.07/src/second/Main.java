package second;

//蓝桥杯
//小蓝希望所有的货物最终摆成一个大的长方体。即在长、宽、高的方向上
//分别堆 L、W、H 的货物，满足 n = L × W × H。


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		long n = 2021041820210418l;

		List<Long> list = new ArrayList<>();
		// 求因子
		for (long i = 1; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				list.add(i);
				//防止出现2乘2等于4，将两个2添加到列表
				if ((n / i) != i)
					list.add(n / i);
			}
		}
		
		int count = 0;
		// 暴力
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				for (int k = 0; k < list.size(); k++) {
					if (list.get(i) * list.get(j) * list.get(k) == n) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}