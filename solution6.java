import java.util.Stack;
//valid paranthesys
public class solution6 {
    public static boolean isValid(String s) {

        Stack <Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if(c == '(')
                st.push(')');
            else if(c == '{')
                st.push('}');
            else if(c == '[')
                st.push(']');
            else if(st.isEmpty() || st.pop() != c)
                return false;
        }
        
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        boolean res = isValid(s);
        System.out.println(res);
    }
}
