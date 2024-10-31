import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void subseq(String s,String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        int code = ch;
        String ros=s.substring(1);
        subseq(ros,ans);
        subseq(ros,ans+ch);
        subseq(ros,ans+code);
    }
    public static void characters(String s,String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String code = keypad[ch-'0'];
        String ros=s.substring(1);
        
        
        for(int i=0;i<code.length();i++) {
            characters(ros,ans+code.charAt(i));
        }
    }
    public static void permutations(String s,String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);
            permutations(ros,ans+ch);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="ABCDEFGHIJKL";
		permutations(s,"");

	}
}
