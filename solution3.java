public class solution3 {
    //palindrome
    public static boolean isPalindrome(int x) {
        int rev=0,rem=0,temp=x;

        if(x>0){
            while(temp != 0){
                rem = temp%10;
                rev = rem+rev*10;
                temp /= 10;
            }
        }

        if(rev == x)
            return true;
        else
            return  false;
        
        
        

    }

    public static void main(String[] args) {
        int x = 121;
        boolean res = isPalindrome(x);
        System.out.println(res);
    }
}
