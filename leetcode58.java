
public class leetcode58{
    //Length of Last Word
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String str = s.trim();
        
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' ')
                count++;
            else
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }
}