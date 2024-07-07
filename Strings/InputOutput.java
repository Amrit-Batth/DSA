package strings;
import java.util.*;

public class InputOutput {
    public String str() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter string");
        String str = sc.nextLine();
        sc.close();

        return str;
    }

public static String reverse(char ch[]) {
    int  i = 0;
    int j =  ch.length-1;
    while(i<j) {
       char temp = ch[i];
       ch[i] = ch[j];
       ch[j] = temp; 
       i++;
       j--;
    } 
    return new String(ch);
    }
    public static void main(String[] args) {
        
        // InputOutput obj = new InputOutput();
        // String str = obj.str();
        String str= "abcacbadadddde";

        char ch[] = str.toCharArray();

        Arrays.sort(ch);
        
        
        char ch1=' ';
        char ch2=' ';

        int frequency = 0; 
        int freq = 1;

        for(int i=0;i< ch.length-1;i++) {
            if(ch[i] == ch[i+1]) {
                freq++;
                ch1 = ch[i]; 
            }else {
                freq = 1;
            }
            if(freq > frequency) {
                frequency = freq;
                ch2 = ch1;
            }
        }
        System.out.println(frequency+" "+ch2);



        
        }
        
     }   
        

