import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double payment = scanner.nextDouble();
        scanner.close();
  
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        /* Create custom Locale for India. 
        Here used the "IANA Language Subtag Registry" to find India's country code */
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}