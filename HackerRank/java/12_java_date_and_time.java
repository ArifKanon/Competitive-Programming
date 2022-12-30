import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result{
    public static String findDay(int month, int day, int year){
        String input_date= "" + day + "/" + month + "/" + year;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        String myDay = null;

        try{
            Date dt = format1.parse(input_date);
            DateFormat format2 = new SimpleDateFormat("EEEE"); 
            myDay = format2.format(dt);
        }
        catch(ParseException e){
            e.printStackTrace();
        }

        return myDay.toUpperCase();
    }
}

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] input = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }
}