import java.util.*;

public class draft {

    public static void main(String[] args) {
            int[] nums1 = new int[2];
            int[] nums2 = new int[2];

            nums1[0]=1;
            nums1[1]=3;
            nums2[0]=2;
            nums2[1]=4;
            double ans = findMedianSortedArrays(nums1, nums2);
            System.out.println(ans);
        
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
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
