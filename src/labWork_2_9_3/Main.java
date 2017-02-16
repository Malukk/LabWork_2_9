package labWork_2_9_3;

import java.util.Arrays;

/**
 * Created by Bulik on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "Using methods of class String";
        char[]  let = uniqueChars(myStr);
        System.out.println(Arrays.toString(let));

    }
    public static char[] uniqueChars(String s) {
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                letters.append(ch);
            }


        }
        return letters.toString().toCharArray();
    }
}
