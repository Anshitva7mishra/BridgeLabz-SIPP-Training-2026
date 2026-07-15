public class lC_485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0;
        int con = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                con++;
                max_ones = Math.max(con, max_ones);
            } else {
                con = 0;
            }
        }
        return max_ones;

    }
}