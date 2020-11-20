import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int res = Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],                           nums[0] * nums[1] * nums[nums.length - 1]);

        return res;
    }

    public static void main(String[] args) {
        int product1 = maximumProduct(new int[]{-100,-98,-1,2,3,4});
        int product2 = maximumProduct(new int[]{-1,-2,-3});
        int product3 = maximumProduct(new int[]{1,2,3});

        System.out.println(product1 + " " + product2 + " " + product3);
    }
}
