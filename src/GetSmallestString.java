public class GetSmallestString {
    public static String getSmallestString(int n, int k) {
        int[] res = new int[n];

        for(int i = 0; i < res.length; i++){
            res[i] = 1;
            k -= 1;
        }

        int j = res.length - 1;
        while(k >= 26) {
            k = k - 25;
            res[j] += 25;
            j--;
        }
        res[j] += k;


        return numsToStr(res);
    }

    private static String numsToStr(int[] nums){
        StringBuilder sb = new StringBuilder();

        for (int i: nums){
            sb.append(intToChar(i));
        }

        return sb.toString();
    }

    private static char intToChar(int a){
        return (char)(a + 'a' - 1);
    }

    public static void main(String[] args) {
        String res = getSmallestString(5, 73);
        System.out.println(res);
    }
}
