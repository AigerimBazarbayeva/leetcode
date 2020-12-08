public class RotateArray {
    public void rotate(int[] nums, int k) {

        while(k > 0){
            int length = nums.length;
            int numb = nums[length - 1];

            for(int i = length - 1; i > 0; i--){
                nums[i] = nums[i - 1];
            }

            nums[0] = numb;
            k--;
        }
    }
}
