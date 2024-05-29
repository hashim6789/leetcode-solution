import java.util.ArrayList;
import java.util.List;

public class leetcode118 {
    //118. Pascal's Triangle

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = generate(rows);
        
        for(List<Integer> res : result){
            System.out.println(res);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        List<Integer> firsRrow = new ArrayList<>();
        firsRrow.add(1);
        triangle.add(firsRrow);

        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
