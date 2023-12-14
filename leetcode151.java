public class leetcode151{
    //Reverse words in a String
    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" +");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}