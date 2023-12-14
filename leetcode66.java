public class leetcode66 {
    //Plus One
    public static int[] plusOne(int[] digits) {
        
        int n =digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_digit = new int[n+1];
        new_digit[0] = 1;
        return new_digit;
    }
    public static void main(String[] args) {
        int[] digit = {9,9,9};
        int[] res = plusOne(digit);
        for(int i=0;i<=res.length-1;i++)
            System.out.println(res[i]);
    }
}
