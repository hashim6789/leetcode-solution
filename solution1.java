import java.util.Scanner;
//power of four
class Solution1 {
        public static boolean isPowerOfFour(int n) {

            if(n == 0)
                return false;

            while(n != 1){
                if(n%4 != 0)
                    return false;
                else
                    n /= 4;
            }
            return true;            
        }

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a number:");
                int a = sc.nextInt();

                boolean res = isPowerOfFour(a);
                System.out.println(res);
            }
        }
    }

