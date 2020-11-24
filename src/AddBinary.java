public class AddBinary {
    public static String addBinary(String a, String b) {
        char[] aArray = a.toCharArray();
        reverse(aArray);
        char[] bArray = b.toCharArray();
        reverse(bArray);
        int carry = 0;
        StringBuilder sum = new StringBuilder();

        for(int i = 0; i < Math.max(aArray.length, bArray.length); i++){
            int col = carry;

            if(i < aArray.length){
                int aI = charToInt(aArray[i]);
                col += aI;
            }

            if(i < bArray.length){
                int bI = charToInt(bArray[i]);
                col += bI;
            }

            if(col >= 2){
                carry = 1;
                sum.append(intToChar(col % 2));
            }else{
                carry = 0;
                sum.append(intToChar(col));
            }
        }

        if(carry > 0){
            sum.append(intToChar(carry));
        }

        return sum.reverse().toString();
    }


    private static void reverse(char[] array){
        int i = 0;
        int j = array.length - 1;

        while(i < j){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private static int charToInt(char a){
        return a - '0';
    }

    private static char intToChar(int a){
        return (char)(a + '0');
    }

    public static void main(String[] args) {
        String test1 = addBinary("11", "11");
        System.out.println(test1);
    }
}
