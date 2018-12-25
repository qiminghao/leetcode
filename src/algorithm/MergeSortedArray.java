package algorithm;


/**
 * 88. Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * 
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * @author qiminghao
 *
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray obj = new MergeSortedArray();
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		int m = 3, n = 3;
		obj.merge(nums1, m, nums2, n);
		for (int val : nums1) {
			System.out.print(val + " ");
		}
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int cur = m + n - 1;
		while (m > 0 && n > 0) {
			if (nums1[m - 1] > nums2[n - 1])
				nums1[cur--] = nums1[--m];
			else
				nums1[cur--] = nums2[--n];
		}
		while (m > 0) {
			nums1[cur--] = nums1[--m];
		}
		while (n > 0) {
			nums1[cur--] = nums2[--n];
		}
	}

}
