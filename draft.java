public class draft {

    public static void main(String[] args) {
    
        int[] sample = new int[]{ 1,1 };
        System.out.println(maxArea(sample));
    }

    public static int maxArea(int[] height) {
        int tmp = 0;
        int max = 0;
        int maxheight = 0;
        int left = 0;
        int right = height.length-1;
    
        // get max height
        for (int a : height){
            if (a>maxheight) maxheight=a;
        }
    
        for (int i=1; i<=maxheight; i++) {
            while (height[left]<i) {
                left++;
            }
            while (height[right]<i) {
                right--;
            }
            

            if (left>right) break;
        
            tmp = i*(right-left);
            System.out.println(right + " "+left);
            if (tmp>max) max = tmp;
        }
        return max;
    }
}
