import java.util.ArrayList;
import java.util.List;

public class leetcode119 {
    //119. Pascal's Triangle II

    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> res = getRow(rowIndex);
        System.out.println(res);
    }

     public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        if(rowIndex == 0){
            row.add(1);
        }else if (rowIndex == 1) {
            row.add(1);
            row.add(1);
            
        }else {
            List<Integer> prevRow = new ArrayList<>();
            prevRow.add(1);
            prevRow.add(1);
            
            for(int i=2; i<=rowIndex; i++){
                List<Integer> currRow = new ArrayList<>();
                currRow.add(1);
                for(int j=1; j<i; j++){
                    currRow.add(j, prevRow.get(j-1) + prevRow.get(j));
                }
                currRow.add(1);
                prevRow = currRow;
            }
            row = prevRow;
        }
        return row;
    }
}
