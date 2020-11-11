import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        if(m == 0){
            return new int[0];
        }
        int n = matrix[0].length;
        if(n == 0){
            return new int[0];
        }
        int counter = 0;
        int i = 0;
        int j = 0;

        //up
        //down

        result.add(matrix[0][0]);
        counter++;

        while(counter != m * n){

            //up
            while(0 <= i - 1 && i - 1 < m && 0 <= j + 1 && j + 1 < n){
                i--;
                j++;
                result.add(matrix[i][j]);
                counter++;
            }

            //shift after up
            if(j < n - 1){
                j++;
            }else{
                i++;
            }

            if(j < n && i < m){
                result.add(matrix[i][j]);
                counter++;
            }

            //down
            while(0 <= i + 1 && i + 1 < m && 0 <= j - 1 && j - 1 < n){
                i++;
                j--;
                result.add(matrix[i][j]);
                counter++;
            }

            //shift after down
            if(i < m - 1){
                i++;
            }else{
                j++;
            }

            if(i < m  && j < n){
                result.add(matrix[i][j]);
                counter++;
            }

        }

        int [] res = result.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{
            {1, 2, 3, 10, 11, 12},
            {4, 5, 6, 13, 14, 15},
            {7, 8, 9, 16, 17, 18}
        };
        int[] res = findDiagonalOrder(test);

        for (int i: res){
            System.out.println(i);
        }
    }
}
