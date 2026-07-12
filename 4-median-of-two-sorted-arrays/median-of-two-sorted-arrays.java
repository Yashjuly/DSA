import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }

        // Copy nums2
        int temp = 0;
        for (int i = nums1.length; i < mergedArray.length; i++) {
            mergedArray[i] = nums2[temp];
            temp++;
        }

        // Sort the merged array
        Arrays.sort(mergedArray);

        int n = mergedArray.length;

        if (n % 2 != 0) {
            return (double) mergedArray[n / 2];
        } else {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        }
    }
}