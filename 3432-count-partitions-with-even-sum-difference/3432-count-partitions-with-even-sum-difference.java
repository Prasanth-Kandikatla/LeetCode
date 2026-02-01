class Solution {
    public int countPartitions(int[] nums) {
        int[] sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        int rightSum = 0, leftSum = 0, count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            rightSum = sum[nums.length] - sum[i+1];
            leftSum = sum[i+1];

            if((rightSum - leftSum) % 2 == 0) count++;
        }

        return count;
    }
}