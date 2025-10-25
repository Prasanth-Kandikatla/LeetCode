class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int count = 1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
                continue;
            }
            nums[i+1] = nums[j];
            i++;
            j++;
            count++;
        }
        return count;























        // if(nums.length == 0) return 0;
        
        // int k = 1;
        
        // for (int i = 1; i < nums.length; i++) {
        //     if(nums[i] != nums[i-1]) {
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;
    }
}