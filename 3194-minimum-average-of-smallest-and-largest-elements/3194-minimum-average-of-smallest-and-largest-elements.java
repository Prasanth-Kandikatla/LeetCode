class Solution {
    public double minimumAverage(int[] nums) {
        int[] averages = new int[nums.length / 2];
        Arrays.sort(nums);
        float average = 0;
        float min = Float.MAX_VALUE;
        int left = 0, right = nums.length - 1;

        while(left < right) {
            average = ((float)nums[left] + (float)nums[right]) / 2;
            if(min > average) {
                min = average;
            }
            left++;
            right--;
        }

        return min;
    }
}