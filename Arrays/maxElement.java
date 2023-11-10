package Arrays;

public class maxElement {

    public static int findMaxNumber(int[] nums) {
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 7, 2, 8, 5 };
        int maxNum = findMaxNumber(nums);
        System.out.println("The maximum number in the array is: " + maxNum);
    }
}
