package labWork_2_9_4;

import java.util.StringTokenizer;

/**
 * Created by Bulik on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Name of Student";
        StringTokenizer stringTokenizer = new StringTokenizer(myStr, " ,.:");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
