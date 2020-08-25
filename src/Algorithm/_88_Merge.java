package Algorithm;

import java.util.Arrays;

/**
 * 88.合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class _88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = Arrays.copyOf(nums1, m);
        int p1 = 0, p2 = 0, index = 0;
        while (p1 < m && p2 < n)
            nums1[index++] = tmp[p1] < nums2[p2] ? tmp[p1++] : nums2[p2++];
        if (p1 < m)
            System.arraycopy(tmp, p1, nums1, p1 + p2, m - p1);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, n - p2);
    }

    public void merge_2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int index = m + n - 1;
        while (p1 >= 0 && p2 >= 0)
            nums1[index--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public void merge_1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
