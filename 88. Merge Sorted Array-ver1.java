class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int result[] = new int[m + n];
        int temp = -1;
        int index1 = 0;
        int index2 = 0;

        if (n == 0)
            return;

        for (int i = 0; i < m + n; i++) {
            if (nums1[index1] == 0 && index1 >= m) {
                result[i] = nums2[index2];
                index2++;
            } else {
                if(index1 < m && index2 < n) { 
                    if (nums1[index1] <= nums2[index2]) {
                        result[i] = nums1[index1];
                        index1++;
                    } else {
                        result[i] = nums2[index2];
                        index2++;
                    }
                }
                else if( index1 < m && index2 >= n) {
                    result[i] = nums1[index1];
                    index1++;
                }
                else {
                    result[i] = nums2[index2];
                    index2++;
                }
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}
