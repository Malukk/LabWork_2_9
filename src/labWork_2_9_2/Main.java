package labWork_2_9_2;

/**
 * Created by Bulik on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon", myStr2 = "Tomcat";
        for (int i =0; i<myStr1.length(); i++){
            char ch = myStr1.charAt(i);
            if (myStr2.indexOf(ch) == -1){
                System.out.print(ch + ", ");
            }
        }

    }
}
