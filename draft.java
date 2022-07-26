import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class draft {

    public static void main(String[] args) {
    
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        int a = 0;
        int b = 0;
        int c = 0;
        int tmp;

        // return null when input is null
        if (nums.length==0) return res;

        // sort
        Arrays.sort(nums);
    
        // check sum
        for (; a<=nums.length-3; ) {
            b=a+1;
            c=nums.length-1;
            while(c>b) {
                tmp = nums[a]+nums[b]+nums[c];
                if (tmp==0) {
                    res.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    b++;
                    while (nums[b]==nums[b-1]) b++;
                    c--;
                    while (nums[c]==nums[c+1]) c--;
                } else if (tmp>0) {
                    c--;
                    while (nums[c]==nums[c+1]) c--;
                } else {
                    b++;
                    while (nums[b]==nums[b-1]) b++;
                }
            }
            a++;
            while (nums[a]==nums[a-1]) a++;
        }
        return res;
    }
}
