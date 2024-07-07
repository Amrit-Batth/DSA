package strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        s = new String(ch1);
        t = new String(ch2);
        
        return (s.equals(t));
    }
    
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

}
