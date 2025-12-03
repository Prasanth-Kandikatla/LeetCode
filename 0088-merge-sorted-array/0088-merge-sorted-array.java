class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int len = nums1.length - 1;
       n--;
       m--;

       while(n >=0 && m >= 0 ) {
            if(nums1[m] < nums2[n]) {
                nums1[len] = nums2[n];
                len--;
                n--;
            } else {
                nums1[len] = nums1[m];
                len--;
                m--;
            }
       }

       while (n >= 0) {
            nums1[len] = nums2[n];
            len--;
            n--;
       }
    }
}