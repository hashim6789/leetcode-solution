public class leetcode1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int l1 = word1.length()-1,l2 = word2.length()-1;
        while(i<=l1 || j<=l2){
            if(i<=l1) sb.append(word1.charAt(i));
            if(j<=l2) sb.append(word2.charAt(j));
            i++;
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "pqrs";
        System.out.println(mergeAlternately(a,b));
    }
}
