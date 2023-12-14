public class leetcode28{
    //Find the Index of the First Occurrence in a String
    public static int strStr(String haystack, String needle) {
        
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }
}