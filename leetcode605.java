public class leetcode605 {
//Can Place Flowers

public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        for(int i=0;i<length;i++){
            if(flowerbed[i]==0){
                int next = (i==length-1)?0:flowerbed[i+1];
                int prev = (i==0)?0:flowerbed[i-1];
                if(next==0 && prev==0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
}

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}