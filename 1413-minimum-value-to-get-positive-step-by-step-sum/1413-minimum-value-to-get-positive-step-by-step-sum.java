class Solution {
    public int minStartValue(int[] nums) {
        int[] sum  = new int[nums.length + 1];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
            if(sum[i+1] < min) {
                min = sum[i+1];
            }
        }

        if(min < 0) {
            return -(min - 1);
        } else {
            return 1;
        }
    }
}