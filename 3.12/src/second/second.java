package second;

//��������

public class second {
	public static void main(String[] args) {
		int[] nums = { 1, 20, 5, 9, 97, 8, 10, 1, 7, 1, 1 };
		Solution s = new Solution();
		s.sorted(nums, 0, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

class Solution {
	public int[] sortArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		sorted(nums, left, right);
		return nums;
	}

	public void sorted(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}
		int key = left;
		int low = left ;
		int height = right;
		while (low < height) {
			while (nums[height] >= nums[key] && low < height)
				height--;
			while (nums[low] <= nums[key] && low < height)
				low++;

			if (low < height) {
				int temp = nums[low];
				nums[low] = nums[height];
				nums[height] = temp;
			}
		}
		int temp = nums[key];
		nums[key] = nums[height];
		nums[height] = temp;
		sorted(nums, left, height - 1);
		sorted(nums, height + 1, right);
	}
}

//class Solution {
//	public static void quickSort(int[] arr, int low, int high) {
//		int i, j, temp, t;
//		if (low > high) {
//			return;
//		}
//		i = low;
//		j = high;
//		// temp���ǻ�׼λ
//		temp = arr[low];
//
//		while (i < j) {
//			// �ȿ��ұߣ���������ݼ�
//			while (temp <= arr[j] && i < j) {
//				j--;
//			}
//			// �ٿ���ߣ��������ҵ���
//			while (temp >= arr[i] && i < j) {
//				i++;
//			}
//			// ������������򽻻�
//			if (i < j) {
//				t = arr[j];
//				arr[j] = arr[i];
//				arr[i] = t;
//			}
//
//		}
//		// ��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
//		arr[low] = arr[i];
//		arr[i] = temp;
//		// �ݹ�����������
//		quickSort(arr, low, j - 1);
//		// �ݹ�����Ұ�����
//		quickSort(arr, j + 1, high);
//	}
//
//}



//class QuickSort {
//    public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp���ǻ�׼λ
//        temp = arr[low];
// 
//        while (i<j) {
//            //�ȿ��ұߣ���������ݼ�
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //�ٿ���ߣ��������ҵ���
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //������������򽻻�
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
// 
//        }
//        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
//         arr[low] = arr[i];
//         arr[i] = temp;
//        //�ݹ�����������
//        quickSort(arr, low, j-1);
//        //�ݹ�����Ұ�����
//        quickSort(arr, j+1, high);
//    }
// 
// 
//    public static void main(String[] args){
//        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
//        quickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}