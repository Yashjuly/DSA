class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1p = m - 1;
        int n2p = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {

            if (n2p < 0) {
                break;
            }

            if (n1p >= 0 && nums1[n1p] > nums2[n2p]) {
                nums1[i] = nums1[n1p];
                n1p--;
            } else {
                nums1[i] = nums2[n2p];
                n2p--;
            }
        }
    }
}