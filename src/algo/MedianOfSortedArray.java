package algo;

public class MedianOfSortedArray {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergedNum = merged(nums1, nums2);
		int i = mergedNum.length / 2;
		double medianValue = mergedNum[i];
		if (mergedNum.length % 2 == 0) {
			medianValue = (medianValue + mergedNum[i + 1]) / 2;
		}
		return medianValue;
	}

	public int[] merged(int[] num1, int[] num2) {
		int[] values = new int[num1.length + num2.length];
		int num1_index = 0;
		int num2_index = 0;
		int values_index = 0;
		while (num1_index < num1.length && num2_index < num2.length) {
			if (num1[num1_index] < num2[num2_index]) {
				values[values_index] = num1[num1_index];
				values_index++;
				num1_index++;
			} else {
				values[values_index] = num2[num2_index];
				values_index++;
				num2_index++;
			}
		}
		while (num1_index < num1.length) {
			values[values_index] = num1[num1_index];
			values_index++;
			num1_index++;
		}
		while (num2_index < num2.length) {
			values[values_index] = num2[num2_index];
			values_index++;
			num2_index++;
		}
		return values;
	}

}
