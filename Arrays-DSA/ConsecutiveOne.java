public class ConsecutiveOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;

            } else if (nums[i] == 0) {
                maxOne = Math.max(maxOne, cnt);
                cnt = 0;
            }
        }
        return Math.max(maxOne, cnt);

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 1, 1, 0 };
        System.out.println(
                "maximum number of consecutive 1's in the given binary array are: " + findMaxConsecutiveOnes(nums));

    }
}
