package first;
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。

//
//注意：答案中不可以包含重复的三元组。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3) {
			return Collections.emptyList();
		}
//       	  如果本身就没有三个数，就返回空集合
  
		Arrays.sort(nums);
//            排序        

		LinkedList<List<Integer>> result = new LinkedList<>();
//            定义结果列表

		for (int i = 0; i < nums.length - 2; i++) {

			if (nums[i] > 0) {
				return result;
			}
//            肯定没有结果

			if (i != 0 && (nums[i] == nums[i - 1])) {
				continue;
			}
			int head = i + 1;
			int tail = nums.length - 1;
			int target = -nums[i];
			while (head < tail) {
				int sum = nums[head] + nums[tail];
				if (target == sum) {
					List<Integer> integerList = Arrays.asList(nums[i], nums[head], nums[tail]);
					result.add(integerList);
//                    integerList.sort(Comparator.naturalOrder());
					while (head < tail && nums[head] == nums[head + 1]) {
						head++;
					}
					while (head < tail && nums[tail] == nums[tail - 1]) {
						tail--;
					}
					head++;
					tail--;
				} else if (target >= sum) {
					head++;
				} else {
					tail--;
				}
			}

		}
		return result;
	}
}