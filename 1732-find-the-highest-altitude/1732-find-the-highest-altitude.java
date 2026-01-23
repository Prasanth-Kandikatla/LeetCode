class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum  = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<gain.length; i++) {
            sum[i+1] = sum[i] + gain[i];
            if(sum[i+1] > max) {
                max = sum[i+1];
            }
        }

        if(max < 0) return 0;
        return max;
    }
}