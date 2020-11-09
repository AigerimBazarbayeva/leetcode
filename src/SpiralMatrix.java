import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        if(matrix.length == 0){
            return result;
        }

        int n = matrix.length;
        int m = matrix[0].length;


        boolean[][] used = new boolean[n][m];
        int i = 0;
        int j = 0;
        int counter = 0;

        used[0][0] = true;
        counter = 1;
        result.add(matrix[0][0]);

        while(counter != n * m){
            //right
            while(j < m - 1 && !used[i][j + 1]){
                j++;
                used[i][j] = true;
                result.add(matrix[i][j]);
                counter++;
            }
            //down
            while(i < n - 1 && !used[i + 1][j]){
                i++;
                used[i][j] = true;
                result.add(matrix[i][j]);
                counter++;
            }
            //left
            while(j > 0 && !used[i][j - 1]){
                j--;
                used[i][j] = true;
                result.add(matrix[i][j]);
                counter++;
            }
            //up
            while(i > 0 && !used[i - 1][j]){
                i--;
                used[i][j] = true;
                result.add(matrix[i][j]);
                counter++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);

        for(Integer i: list){
            System.out.println(i);
        }
    }
}
