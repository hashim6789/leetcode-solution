import java.util.HashMap;

public class leetcode860 {
    //860. Lemonade Change
    public static void main(String[] args) {
        int[] arr = {5,5,10,20};
        boolean res = lemonadeChange(arr) ;
        System.out.println(res);
    }

    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> change = new HashMap<Integer, Integer>();
        change.put(5, 0);
        change.put(10, 0);
        change.put(15, 0);
        // int[] change = new int[bills.length];
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                change.put(5, change.get(5)+1);
            }else if(bills[i] == 10 && change.get(5) > 0){
                change.put(5, change.get(5) - 1);
                change.put(10, change.get(10) + 1);
            }else if(bills[i] == 20 && ((change.get(10) > 0 && change.get(5) > 0) || change.get(5) >= 3)){
                if(change.get(10) > 0 && change.get(5) > 0){
                    change.put(5, change.get(5) - 1);
                    change.put(10, change.get(10) - 1);
                }else {
                    change.put(5, change.get(5) - 3);
                }
            }else {
                return false;
            }
            System.out.print(change.get(5) + " " + change.get(10) + " " + change.get(15));
            System.out.println();
        }
        return true;
    }
}
