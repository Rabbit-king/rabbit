package seconde;

public class second_add {

}

class _Solution {
	public int maxArea(int[] height) {
		int max = 0;
		int l = 0, r = height.length - 1;
		while (l < r) {
			int min = Math.min(height[l], height[r]);

			int temp = min * (r - l);

			max = Math.max(max, temp);

			// 快速跳过
			while (height[l] <= min && l < r) {
				++l;
			}

			while (height[r] <= min && l < r) {
				--r;
			}
		}
		return max;
	}
}

//就是从根本入手，面积是 底*高
//所以先令底最大，那只能看高的增长带来的面积是否可以用底的减小来牺牲。
//如果可以，高的增长比底的减小要面积大，那可以牺牲底长
//我归纳为收益比思想