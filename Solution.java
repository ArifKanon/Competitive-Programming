import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        Pattern p = Pattern.compile("[A-Za-z !,?._'@]+");
        Matcher m = p.matcher(s);
        // Pattern p = Pattern.compile("(\\d+)|([a-zA-Z]+)");
        // Matcher m = p.matcher("810LN15");
        List<String> tokens = new LinkedList<String>();
        while(m.find())
        {
            String token = m.group( 1 ); //group 0 is always the entire match   
            tokens.add(token);
        }
        //String[] tokens = s.split("[A-Za-z !,?._'@]+");
        for (String st : tokens) {
            System.out.println(st);   
        }
    }
}
