package labWork_2_9_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Bulik on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String [] names = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String name: names ) {
            System.out.println(name + " -> " + checkPersonWithRegExp(name));

        }


    }
    public static boolean checkPersonWithRegExp(String userNameString){
        String regexp = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }
}
