public class leetcode1475 {
    //1475. Final Prices With a Special Discount in a Shop
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3};
        int[] res = finalPrices(arr);
        for(int price : res){
            System.out.print(price+" ");
        }
    }
    public static int[] finalPrices(int[] prices) {
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
