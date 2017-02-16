package labWork_2_9_1;

/**
 * Created by Bulik on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println("First 'ra' -> "+ myStr.indexOf("ra"));
        System.out.println("Last 'ra' -> "+ myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        System.out.println("Reverse -> " + reverseString(myStr));

    }
    public static String reverseString(String str){
        StringBuilder newStr = new StringBuilder(str);
        newStr.reverse();
        return newStr.toString();
    }
}
