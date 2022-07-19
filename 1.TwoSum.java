class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        for (int a = 0; a<nums.length; a++){
            for (int b = a + 1; b< nums.length; b++){
                if (nums[a] + nums[b] == target){
                    ans[0]=a;
                    ans[1]=b;
                    return ans;
                }
            }
        }
        // Solution Not Found, throw exception
        return ans;
    }
    
}


class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int a = 0; a<nums.length; a++){
            map.put(nums[a],a);
        }

        for (int b = 0; b<nums.length; b++){
            int tmp = target-nums[b];
            if (map.containsKey(tmp) && b!=map.get(tmp)){
                ans[0]=b;
                ans[1]=map.get(tmp);
            }
        }

        return ans;
        // Solution Not Found, throw exception
    }
}
