import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) throws Exception{
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            res.add(new ArrayList<>());
            for(int j = 0; j <= i; j++){
                res.get(i).add(0);
                debug(res);
            }
        }

        for(int i = 0; i < res.size(); i++){
            res.get(i).set(0, 1);
            debug(res);
        }

        for(int i = 0; i < res.size(); i++){
            res.get(i).set(i, 1);
            debug(res);
        }

        for(int k = 2; k < res.size(); k++){
            for(int l = 1; l < k; l++){
                res.get(k).set(l, res.get(k - 1).get(l) + res.get(k - 1).get(l - 1));
                debug(res);
            }
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        List<List<Integer>> res = generate(5);
        /*
       [
       [1],
       [1,1],
       [1,2,1],
       [1,3,3,1],
       [1,4,6,4,1]
       ]
        */
    }

    public static void debug(List<List <Integer>> list) throws Exception {
        if(true){
            return;
        }
        for(List<Integer> l : list){
            for(Integer i: l){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.in.read();
    }
}
