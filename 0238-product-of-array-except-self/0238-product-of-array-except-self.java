class Solution {
    public int[] productExceptSelf(int[] nums) {

        // O(N^2)
        //     int[] arr = new int[nums.length];

        //     for (int i = 0; i< nums.length; i++) {
        //         int product = 1;
        //         for (int j = 0; j< nums.length; j++) {
        //             if(i == j) continue;
        //             product *= nums[j];
        //         }
        //         arr[i] = product;
        //     }
        //    return arr;

        //O(N) Approach 2
        // int n = nums.length;
        // int[] result = new int[n];
        // result[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     result[i] = result[i - 1] * nums[i - 1];
        // }
        // int product = 1;
        // for (int i = n - 1; i >= 0; i--) {
        //     result[i] *= product;
        //     product *= nums[i];
        // }
        // return result;

        int count = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                count++;
                continue;
            }
            product *= num;
        }

        int[] arr = new int[nums.length];
        if (count > 1) {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = 0;
            }
        } else if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    arr[i] = product;
                    continue;
                }
                arr[i] = 0;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = product / nums[i];
            }
        }
        return arr;
    }
}