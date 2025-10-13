public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int q = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[q] = nums[i];
                q++;
            }
        }
        return q;
    }
    public static void main(String[] args) {
        int[] nums = {4, 9, 7, 4, 4, 6};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}