public class leetcode1071 {
    //gratest common divisor of strings
    public static int findGcd(int n1,int n2){
        if(n2 == 0) return n1;
        else return findGcd(n2,n1%n2);
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        else{
            int gcd = findGcd(str1.length(), str2.length());
            return str2.substring(0, gcd);
        }
        
    }

    public static void main(String[] args) {
        String a = "ABABAB";
        String b = "ABAB";
        System.out.println(gcdOfStrings(a, b));
    }
}
