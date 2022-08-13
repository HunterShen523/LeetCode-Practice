class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len;
        double ans;
        int c = 0;
        int ptr1 = 0;
        int ptr2 = 0;
    
        int[] nums = new int[nums1.length+nums2.length];
    
        while ( ptr1<nums1.length && ptr2<nums2.length ) {
            // Add next smallest
            if (nums1[ptr1] > nums2[ptr2]) {
                nums[c]=nums2[ptr2];
                ptr2++;
            } else {
                nums[c]=nums1[ptr1];
                ptr1++;
            }
            c++;
        }

        // one array reach end, adding the rest from the other one
        while (ptr1<nums1.length){
            nums[c]=nums1[ptr1];
            ptr1++;
            c++;
        }

        while (ptr2<nums2.length){
            nums[c]=nums2[ptr2];
            ptr2++;
            c++;
        }

        // find the median
        len = nums.length;
        if (len % 2 == 0){
            ans = nums[len/2-1] + nums[len/2];
            ans/=2;
        } else {
            ans = nums[len/2];
        }

        return ans;

    }
}