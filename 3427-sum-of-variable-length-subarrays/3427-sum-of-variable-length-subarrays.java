class Solution {
    public int subarraySum(int[] nums) {

        int[] sum = new int[nums.length + 1];
        for (int i = 0; i< nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }

        int total = 0;
        int start = 0;
        for (int i = 0; i< nums.length; i++) {
            start = Math.max(0, i - nums[i]);
            total += sum[i+1] - sum[start];
        }
        
        return total;
    }
}