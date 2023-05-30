public class NextPermutation {
    public static int[] nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;

            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);

        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1,5,8,4,5,6,3,7,4,1 };
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]+" ");

        }
        System.out.println();

    }
}
