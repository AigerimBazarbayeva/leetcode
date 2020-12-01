public class WaysToMakeAFairArray {
    public static int waysToMakeFair(int[] nums) {
        int counter = 0;

        int[] oddRightSum = new int[nums.length];
        int[] evenRightSum = new int[nums.length];
        int[] oddLeftSum = new int[nums.length];
        int[] evenLeftSum = new int[nums.length];

        //ols
        for(int i = 0; i < nums.length; i++){
            int remainder = 0;

            if(i % 2 == 1){
                remainder = nums[i];
            }else{
                remainder = 0;
            }

            if(i == 0){
                oddLeftSum[i] = remainder;
            }else{
                oddLeftSum[i] = oddLeftSum[i - 1] + remainder;
            }
        }

        //els
        for(int i = 0; i < nums.length; i++){
            int remainder = 0;

            if(i % 2 == 0){
                remainder = nums[i];
            }else{
                remainder = 0;
            }

            if(i == 0){
                evenLeftSum[i] = remainder;
            }else{
                evenLeftSum[i] = evenLeftSum[i - 1] + remainder;
            }
        }

        //ers
        for(int i = nums.length - 1; i >= 0; i--){

            int remainder = 0;

            if(i % 2 == 0){
                remainder = nums[i];
            }else{
                remainder = 0;
            }

            if(i != nums.length - 1) {
                evenRightSum[i] = evenRightSum[i + 1] + remainder;
            }else{
                evenRightSum[i] = remainder;
            }
        }

        //ors
        for(int i = nums.length - 1; i >= 0; i--){

            int remainder = 0;

            if(i % 2 == 1){
                remainder = nums[i];
            }else{
                remainder = 0;
            }

            if(i != nums.length - 1) {
                oddRightSum[i] = oddRightSum[i + 1] + remainder;
            }else{
                oddRightSum[i] = remainder;
            }
        }



        for(int i = 0; i < nums.length; i++){
            int totalEven = 0;
            int totalOdd = 0;

            if(i != 0){
                totalEven += evenLeftSum[i - 1];
                totalOdd += oddLeftSum[i - 1];
            }

            if(i != nums.length - 1){
                totalEven += oddRightSum[i + 1];
                totalOdd += evenRightSum[i + 1];
            }

            if(totalEven == totalOdd){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        //int i = waysToMakeFair(new int[] {1,2,3});
        //int i = waysToMakeFair(new int[] {1,1,1});
        int i = waysToMakeFair(new int[] {2,1,6,4});
        System.out.println(i);
    }
}
