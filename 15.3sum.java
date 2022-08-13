class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
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
                    // increment b, decrement c; skip one when duplicate
                    b++;
                    while (b<c && nums[b]==nums[b-1]) b++;
                    c--;
                    while (c>b && nums[c]==nums[c+1]) c--;
                } else if (tmp>0) {
                    // decrement c; skip one when duplicate
                    c--;
                    while (c>b && nums[c]==nums[c+1]) c--;
                } else {
                    // increment b; skip one when duplicate
                    b++;
                    while (b<c && nums[b]==nums[b-1]) b++;
                }
            }
            // increment a; skip one when duplicate
            a++;
            while (a<=nums.length-3 && nums[a]==nums[a-1]) a++;
        }
        
        return res;
    }
}