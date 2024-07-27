class Solution {  
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {  
        int m = nums1.length;  
        int n = nums2.length;  

        // Ensure nums1 is the smaller array  
        if (m > n) {  
            int[] temp = nums1;  
            nums1 = nums2;  
            nums2 = temp;  
            int tempLen = m;  
            m = n;  
            n = tempLen;  
        }  

        int left = 0;  
        int right = m;  
        int halfLen = (m + n + 1) / 2;  

        while (left <= right) { // Changed from left < right to left <= right  
            int partition1 = left + (right - left) / 2;  
            int partition2 = halfLen - partition1;  

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];  
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];  
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];  
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];  

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {  
                if ((m + n) % 2 == 0) {  
                    // For even total length, return the average of the middle values  
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;  
                } else {  
                    // For odd total length, return the middle value  
                    return Math.max(maxLeft1, maxLeft2);  
                }  
            } else if (maxLeft1 > minRight2) {  
                // Move towards the left in nums1  
                right = partition1 - 1;  
            } else {  
                // Move towards the right in nums1  
                left = partition1 + 1;  
            }  
        }  

        // Control should not reach here, this will indicate an error in input assumptions  
        throw new IllegalArgumentException("Input arrays are not valid.");  
    }  
}
