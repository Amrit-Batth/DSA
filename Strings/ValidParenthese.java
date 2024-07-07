package strings;

public class ValidParenthese {

    public boolean isValid(String s) {
        int i=0;
        while(i < s.length()-1) {
            boolean ans = validation(s.charAt(i), s.charAt(i+1));

            if(!ans) return false;
            else i=i+2;
        }
        return true;
    }

    public boolean validation(char cur,char next)  {
        if(cur == '(') {
            if(next == ')'){
                return true;
            }
        }else if(cur == '[') {
            if(next == ']') {
                return true;
            }
        }else if(cur == '{') {
            if(next == '}') {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ValidParenthese obj = new ValidParenthese();
        
        String s = "(){}[]{}";

        boolean ans = obj.isValid(s);

        System.out.println(ans);
    }
}
