class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int a = i+1; a < nums.length; a ++) {
                if(nums[i] + nums[a] == target) {
                    output[0] = i;
                    output[1] = a;
                    break;
                }
            }
            
        }
        return output;
    }
}