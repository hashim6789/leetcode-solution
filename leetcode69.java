public class leetcode69 {
    //sqrt(x)
    public static int mySqrt(int x) {
        int  res = 0;
        long start = 1, end = x, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid < x){
                start = (mid + 1);
                res = (int)mid;
            }else{
                end = mid - 1;
               
            }
        } 
        return res;
    }
    
    public static void main(String[] args) {
        int x = 8;
        int res = mySqrt(x);
        System.out.println(res);
    }
}
