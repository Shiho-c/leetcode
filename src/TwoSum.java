public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {3,2,3};
        int target = 6;
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
        //return output;
        System.out.println(output[0] + "" + output[1]);
    }
}
