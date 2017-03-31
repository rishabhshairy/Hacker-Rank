import java.util.*;
import java.text.*;
import java.lang.Object.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale locale = new Locale("en","IN");
        NumberFormat i = NumberFormat.getCurrencyInstance(locale);
        NumberFormat us=NumberFormat.getCurrencyInstance(new Locale("en","US"));
        NumberFormat c=NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        NumberFormat f=NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        String india=i.format(payment);
        String us=u.format(payment);
        String china=c.format(payment);
        String france=f.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
