import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale current = new Locale("be", "BY");
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        String s1 = rb.getString("str1");
        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
        System.out.println();

        current = new Locale("en", "US");
        rb = ResourceBundle.getBundle("text", current);
        String s3 = rb.getString("str1");
        System.out.println(s3);
        String s4 = rb.getString("str2");
        System.out.println(s4);
        System.out.println();

        current = new Locale("default", "default");
        rb = ResourceBundle.getBundle("text", current);
        String s5 = rb.getString("str1");
        System.out.println(s5);
        String s6 = rb.getString("str2");
        System.out.println(s6);
    }
}
