public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                // int sum = 0;
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
        return count;
    }
}