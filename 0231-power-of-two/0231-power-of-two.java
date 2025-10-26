class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int result = 0;

        boolean b = (n & (n - 1)) == 0;

        return b;
    }
}