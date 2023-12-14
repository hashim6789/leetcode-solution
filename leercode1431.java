import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leercode1431 {
    //Kids With the Greatest Number of Candies

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i : candies){
            if(i+extraCandies >= max) res.add(true);
            else res.add(false);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
