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

			// ��������
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

//���ǴӸ������֣������ ��*��
//��������������ֻ�ܿ��ߵ���������������Ƿ�����õ׵ļ�С��������
//������ԣ��ߵ������ȵ׵ļ�СҪ������ǿ��������׳�
//�ҹ���Ϊ�����˼��