class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] sum = new int[arr.length + 1];
        int sumOddLength = 0;
        int total = 0;
        for (int i = 0; i< arr.length; i++) {
            sum[i + 1] = sum[i] + arr[i];
        }
        for (int x: arr) {
            total += x;
        }

        for (int left = 0; left < arr.length; left++) {
            for (int right = left + 1; right < arr.length; right++) {
                if((right - left + 1) % 2 != 0) {
                    sumOddLength += sum[right + 1] - sum[left];
                }
            }
        }
        return sumOddLength + total;
    }
}