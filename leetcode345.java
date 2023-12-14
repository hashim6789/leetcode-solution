
public class leetcode345 {

    //Reverse Vowels of a String
    
    public static boolean isVowel( char c){
        c = Character.toLowerCase(c);
        
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;

        return false;
    }

    public static String reverseVowels(String s) {
        
        int len = s.length();
        int f = 0;
        int l = len-1;
        char[] ch = s.toCharArray();

        while (f <= l) {
            if(!isVowel(ch[f])) f++;
            if(!isVowel(ch[l])) l--;
            
            if(isVowel(ch[f]) && isVowel(ch[l])){
                char temp = ch[f];
                ch[f] = ch[l];
                ch[l] = temp;
                f++;
                l--;
            }

        }
        return String.copyValueOf(ch);
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseVowels(s));

    }
}
