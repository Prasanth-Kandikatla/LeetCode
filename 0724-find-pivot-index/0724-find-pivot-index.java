class Solution {
    public int pivotIndex(int[] nums) {
        int[] sum  = new int[nums.length + 1];

        for (int i = 0; i<nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }

        for (int i = 0; i<nums.length; i++) {
            if((sum[nums.length] - sum[i+1]) == (sum[i]-sum[0])) {
                return i;
            }
        }
        

        return -1;
    }
}