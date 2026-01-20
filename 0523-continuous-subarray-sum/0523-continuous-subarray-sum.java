// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         for ( int i = 0; i<nums.length; i++) {
//             int sum = 0;
//             for (int j = i + 1; j < nums.length; j++) {
//                 sum += nums[i]+nums[j];
//                 if(sum % k == 0 ) return true;
//             }
//         }

//         return false;
//     }
// }

//HashMap for O(N) time complixity

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i])  % k;
            if(map.containsKey(sum)) {
                if(i - map.get(sum) > 1) return true;
            }
            else {
                map.put(sum, i);
            }
        }

        return false;
    }
}